package rnsr.rag.art;

import uk.ac.rhul.cs.csle.art.ARTException;
import uk.ac.rhul.cs.csle.artlexer.ARTLexerBase;
/*******************************************************************************
*
* ARTGeneratedLexer.java
*
*******************************************************************************/
public class ARTGeneratedLexer extends ARTLexerBase {
public void artLexicaliseBuiltinInstances() throws ARTException {
  artBuiltin_ID();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_ID);
  artBuiltin_STRING_DQ();
  artLexicaliseTest(ARTGeneratedParser.ARTTB_STRING_DQ);
}

public void artLexicalisePreparseWhitespaceInstances() throws ARTException {
  artBuiltin_WHITESPACE();
}

};
