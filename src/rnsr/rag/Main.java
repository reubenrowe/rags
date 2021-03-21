package rnsr.rag;

import rnsr.rag.art.ARTGeneratedLexer;
import rnsr.rag.art.ARTGeneratedParser;
import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.util.text.ARTText;
import uk.ac.rhul.cs.csle.art.util.text.ARTTextHandlerConsole;
import uk.ac.rhul.cs.csle.art.v3.ARTV3;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.ARTGLLRDT;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.ARTGLLRDTVertex;

import java.io.IOException;

public class Main {

    static ARTText text = new ARTText(new ARTTextHandlerConsole());

    /**
     * Main method as an entry point to the RAG parser system.
     * @param args Input arguments to the parser system:
     *             - 1. A .rag file, the RAG specification to parse with
     *             - 2. (Optional) An input file or string to parse with
     *                      If no input file or string specified, allow command line input
     */
    public static void main(String[] args) {



        if (args.length < 1) {
            errorMsg("Too few arguments given.");
        } else if (args.length >= 2) {

            String argOne = args[0];
            String argTwo = args[1];
            inputFileCheck(argOne, 1, ".art");
            inputFileCheck(argTwo, 2, ".str");

            generateARTParser("RAG.art", "RAG.str");

        }

    }

    public static void generateARTParser(String ragFile, String inFile) {
        try {

            Process pro = Runtime.getRuntime().exec("pwd");

            ARTV3.main(new String[]{ragFile});

            ARTGeneratedParser var2 = new ARTGeneratedParser(new ARTGeneratedLexer());
            var2.artParse(ARTText.readFile(inFile));

            var2.artDerivationSelectFirst();
            var2.artEvaluator();



        } catch (IOException e) {
            e.printStackTrace();
        } catch (ARTException e) {
            e.printStackTrace();
        }
    }

    static void visitTree(ARTGLLRDT var0) {
        visitTree(var0, var0.getRoot(), 0);
    }

    static void visitTree(ARTGLLRDT var0, ARTGLLRDTVertex var1, int var2) {
        if (var1 != null) {
            for(int var3 = 0; var3 < var2; ++var3) {
                text.print("  ");
            }

            text.printf("%d: %s%n", new Object[]{var1.getKey(), var1.getPayload().toString(var0)});
            visitTree(var0, var1.getChild(), var2 + 1);
            visitTree(var0, var1.getSibling(), var2);
        }
    }

    static String treeToTermString(ARTGLLRDT var0) {
        StringBuilder var1 = new StringBuilder();
        treeToTermStringRec(var1, var0, var0.getRoot());
        return var1.toString();
    }

    static void treeToTermStringRec(StringBuilder var0, ARTGLLRDT var1, ARTGLLRDTVertex var2) {
        if (var2 != null) {
            var0.append(var2.getPayload().toStringNoAttributes(var1));
            if (var2.getChild() != null) {
                var0.append("(");
                treeToTermStringRec(var0, var1, var2.getChild());
                var0.append(")");
            }

            if (var2.getSibling() != null) {
                var0.append(", ");
                treeToTermStringRec(var0, var1, var2.getSibling());
            }

        }
    }

    /**
     *
     * @param context
     * @param pos
     * @param suffix
     */
    public static void inputFileCheck(String context, int pos, String suffix) {
        if (!context.endsWith(suffix)) {
            errorMsg("Argument " + pos + " should be a " + suffix + " file.");
        }
    }

    /**
     *
     * @param context
     */
    public static void errorMsg(String context) {
        System.out.println("ERROR: " + context);
        System.exit(-1);
    }

}
