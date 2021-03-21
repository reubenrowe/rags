package rnsr.rag.art;

import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.v3.lex.ARTLexerV3;
/*******************************************************************************
*
* ARTGeneratedLexer.java
*
*******************************************************************************/
public class ARTGeneratedLexer extends ARTLexerV3 {
public void artLexicaliseBuiltinInstances() throws ARTException {
  artBuiltin_ID();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_ID);
  artBuiltin_SIMPLE_WHITESPACE();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_SIMPLE_WHITESPACE);
  artBuiltin_STRING_SQ();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_STRING_SQ);
}

public void artLexicalisePreparseWhitespaceInstances() throws ARTException {
  artBuiltin_SIMPLE_WHITESPACE();
}

};
