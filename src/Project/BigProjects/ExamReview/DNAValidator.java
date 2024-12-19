package Project.BigProjects.ExamReview;

/**
 * HONOR PLEDGE: All work here is honestly obtained and is my own.  Signed:  Michael Walsh
 * @author walshm
 * Date of Completion:  12/18/24
 * <p>
 * Assignment:   	Exam Corrections problem
 * <p>
 * Attribution: The corrections sheet on OneNote and my test
 * <p>
 * General Description:   using the template I was given I write the methods to complete
 * the given project
 * <p>
 */
public class DNAValidator {

    /**
     * A valid DNA string includes only the letters A, C, G, T.
     * @param str
     * @return true, if str is a valid DNA string; false otherwise.
     */
    public static boolean isValidDNA(String str)
    {
        for (int x = 0; x < str.length(); x++)
        {
            char ch = str.charAt(x);
            if (ch != 'A' && ch != 'C' && ch != 'G' && ch != 'T')
            {
                return false;
            }
        }
        return true;
    }

    /**
     * Finds the first occurrence in a given DNA string of gene1 and gene2
     * and calculates the gap between them.
     * @param dna
     * @param gene1
     * @param gene2
     * @return the gap between the matched genes if they are found in the
     * correct order with no overlap; otherwise returns -1.
     */
    public static int matchTwoGenes(String dna, String gene1, String gene2)
    {
        if (!isValidDNA(dna))
        {
            return -1;
        }

        int index1 = dna.indexOf(gene1);
        int index2 = dna.indexOf(gene2);

        if (index1 != -1 && index2 != -1 && index1 + gene1.length() <= index2)
        {
            return index2 - (index1 + gene1.length());
        }

        return -1;
    }


    /**
     *
     * @param dna
     * @param genes - a String containing 2 or more genes separated by '#"
     * @return the sum of the gaps between consecutive genes, if all of them
     * are found in the DNA string in the correct order, with no overlaps.  If
     * one of the genes is not found, or the order is wrong, or two genes
     * overlap, your method should return -1.
     * Hint:  Use matchTwoGenes() repeatedly in this problem.
     */
    public static int matchGenes(String dna, String genes)
    {
        String[] geneArray = genes.split("#");
        int totalGap = 0;

        for (int i = 0; i < geneArray.length - 1; i++)
        {
            int gap = matchTwoGenes(dna, geneArray[i], geneArray[i + 1]);

            if (gap == -1) {
                return -1;
            }

            totalGap += gap;
        }

        return totalGap;
    }


    public static void main(String[] args) {
        // Test carefully and be sure that you try different numbers of genes in part(c).

        System.out.println("Test 1: " + matchGenes("GTACATATTGACAGT", "GTA#TGA#AGT"));
        System.out.println("Test 2: " + matchGenes("GTACATAT", "TAC#ACA#TAT"));
        System.out.println("Test 3: " + matchGenes("GTACATATTGACAGT", "ACA#TGA#TAT"));
        System.out.println("Test 4: " + matchGenes("GTACATATTGACAGT", "AAA#CAT#GAC"));

        System.out.println();
        //wrong reword
        System.out.println("Test 1: " + matchTwoGenes("GTACATAATGACGGT", "ACA", "ACG"));
        System.out.println("Test 2: " + matchTwoGenes("GTACATAACAAGACGGAC", "ACA", "ACG"));
        System.out.println("Test 3: " + matchTwoGenes("GTACAACGGTAA", "ACA", "ACG"));
        System.out.println("Test 4: " + matchTwoGenes("AATACGTAATGACAGT", "ACA", "ACG"));
        System.out.println("Test 5: " + matchTwoGenes("CTACACGAACAGT", "ACA", "ACG"));
        System.out.println("Test 6: " + matchTwoGenes("GTACATATTGACAGT", "ACA", "ACG"));


        //See your exam for some additional test cases and create some of your own to ensure
        // your code works generally.

    }

}
