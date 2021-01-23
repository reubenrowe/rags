package rnsr.rag.art;

import uk.ac.rhul.cs.csle.art.ARTException;
import uk.ac.rhul.cs.csle.artlexer.ARTLexerBase;
import uk.ac.rhul.cs.csle.art.ARTGrammar;
import uk.ac.rhul.cs.csle.art.ARTModeGrammarKind;
import uk.ac.rhul.cs.csle.artgll.*;
import uk.ac.rhul.cs.csle.artgraph.*;
import uk.ac.rhul.cs.csle.arttext.*;
import uk.ac.rhul.cs.csle.artvalue.*;
import uk.ac.rhul.cs.csle.art.ARTBitSet;
/*******************************************************************************
*
* ARTGeneratedParser.java
*
*******************************************************************************/
public class ARTGeneratedParser extends uk.ac.rhul.cs.csle.artgll.ARTGLLParserHashPool {
  private static boolean[] ARTSet1;
  private static boolean[] ARTSet2;
  private static boolean[] ARTSet3;
  private static boolean[] ARTSet4;
  private static boolean[] ARTSet5;
  private static boolean[] ARTSet6;
  private static boolean[] ARTSet7;
  private static boolean[] ARTSet8;
  private static boolean[] ARTSet9;
  private static boolean[] ARTSet10;
  private static boolean[] ARTSet11;
  private static boolean[] ARTSet12;
  private static boolean[] ARTSet13;
  private static boolean[] ARTSet14;
  private static boolean[] ARTSet15;
  private static boolean[] ARTSet16;
  private static boolean[] ARTSet17;
  private static boolean[] ARTSet18;
  private static boolean[] ARTSet19;
  private static boolean[] ARTSet20;
  private static boolean[] ARTSet21;
  private static boolean[] ARTSet22;
  private static boolean[] ARTSet23;
  private static boolean[] ARTSet24;
  private static boolean[] ARTSet25;
  private static boolean[] ARTSet26;
  private static boolean[] ARTSet27;
  private static boolean[] ARTSet28;
  private static boolean[] ARTSet29;
  private static boolean[] ARTSet30;
  private static boolean[] ARTSet31;
  private static boolean[] ARTSet32;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_STRING_DQ = 2;
  public static final int ARTTS__SHREIK = 3;
  public static final int ARTTS__HASH = 4;
  public static final int ARTTS__LPAR = 5;
  public static final int ARTTS__RPAR = 6;
  public static final int ARTTS__COMMA = 7;
  public static final int ARTTS__MINUS_GT = 8;
  public static final int ARTTS__COLON = 9;
  public static final int ARTTS__SEMICOLON = 10;
  public static final int ARTTS__LT = 11;
  public static final int ARTTS__GT = 12;
  public static final int ARTTS__QUERY = 13;
  public static final int ARTTS_Name_COLON = 14;
  public static final int ARTTS__LBRACK = 15;
  public static final int ARTTS__BACKSLASH_SLASH = 16;
  public static final int ARTTS__RBRACK = 17;
  public static final int ARTTS__LBRACE_RBRACE = 18;
  public static final int ARTX_EPSILON = 19;
  public static final int ARTTB_WHITESPACE = 20;
  public static final int ARTL_ART_ragCat = 21;
  public static final int ARTL_ART_ragElement = 22;
  public static final int ARTL_ART_ragEmptySet = 23;
  public static final int ARTL_ART_ragEmptyString = 24;
  public static final int ARTL_ART_ragInverse = 25;
  public static final int ARTL_ART_ragMap = 26;
  public static final int ARTL_ART_ragName = 27;
  public static final int ARTL_ART_ragPair = 28;
  public static final int ARTL_ART_ragQuery = 29;
  public static final int ARTL_ART_ragRewrite = 30;
  public static final int ARTL_ART_ragRule = 31;
  public static final int ARTL_ART_ragRuleRHS = 32;
  public static final int ARTL_ART_ragRules = 33;
  public static final int ARTL_ART_ragStart = 34;
  public static final int ARTL_ART_ragSymbol = 35;
  public static final int ARTL_ART_ragUnion = 36;
  public static final int ARTL_ART_ragCat_54 = 37;
  public static final int ARTL_ART_ragCat_56 = 38;
  public static final int ARTL_ART_ragCat_58 = 39;
  public static final int ARTL_ART_ragCat_60 = 40;
  public static final int ARTL_ART_ragCat_62 = 41;
  public static final int ARTL_ART_ragElement_126 = 42;
  public static final int ARTL_ART_ragElement_128 = 43;
  public static final int ARTL_ART_ragElement_130 = 44;
  public static final int ARTL_ART_ragElement_132 = 45;
  public static final int ARTL_ART_ragElement_134 = 46;
  public static final int ARTL_ART_ragElement_138 = 47;
  public static final int ARTL_ART_ragElement_140 = 48;
  public static final int ARTL_ART_ragElement_135 = 49;
  public static final int ARTL_ART_ragElement_136 = 50;
  public static final int ARTL_ART_ragElement_139 = 51;
  public static final int ARTL_ART_ragEmptySet_158 = 52;
  public static final int ARTL_ART_ragEmptySet_160 = 53;
  public static final int ARTL_ART_ragEmptySet_159 = 54;
  public static final int ARTL_ART_ragEmptyString_154 = 55;
  public static final int ARTL_ART_ragEmptyString_156 = 56;
  public static final int ARTL_ART_ragEmptyString_155 = 57;
  public static final int ARTL_ART_ragInverse_116 = 58;
  public static final int ARTL_ART_ragInverse_118 = 59;
  public static final int ARTL_ART_ragInverse_120 = 60;
  public static final int ARTL_ART_ragInverse_124 = 61;
  public static final int ARTL_ART_ragInverse_121 = 62;
  public static final int ARTL_ART_ragInverse_122 = 63;
  public static final int ARTL_ART_ragMap_142 = 64;
  public static final int ARTL_ART_ragMap_146 = 65;
  public static final int ARTL_ART_ragMap_148 = 66;
  public static final int ARTL_ART_ragMap_150 = 67;
  public static final int ARTL_ART_ragMap_152 = 68;
  public static final int ARTL_ART_ragMap_143 = 69;
  public static final int ARTL_ART_ragMap_144 = 70;
  public static final int ARTL_ART_ragMap_147 = 71;
  public static final int ARTL_ART_ragMap_151 = 72;
  public static final int ARTL_ART_ragName_8 = 73;
  public static final int ARTL_ART_ragName_12 = 74;
  public static final int ARTL_ART_ragName_14 = 75;
  public static final int ARTL_ART_ragName_9 = 76;
  public static final int ARTL_ART_ragName_10 = 77;
  public static final int ARTL_ART_ragName_11 = 78;
  public static final int ARTL_ART_ragName_13 = 79;
  public static final int ARTL_ART_ragPair_64 = 80;
  public static final int ARTL_ART_ragPair_66 = 81;
  public static final int ARTL_ART_ragPair_68 = 82;
  public static final int ARTL_ART_ragPair_72 = 83;
  public static final int ARTL_ART_ragPair_74 = 84;
  public static final int ARTL_ART_ragPair_76 = 85;
  public static final int ARTL_ART_ragPair_78 = 86;
  public static final int ARTL_ART_ragPair_69 = 87;
  public static final int ARTL_ART_ragPair_70 = 88;
  public static final int ARTL_ART_ragPair_73 = 89;
  public static final int ARTL_ART_ragPair_77 = 90;
  public static final int ARTL_ART_ragPair_80 = 91;
  public static final int ARTL_ART_ragPair_84 = 92;
  public static final int ARTL_ART_ragPair_86 = 93;
  public static final int ARTL_ART_ragPair_88 = 94;
  public static final int ARTL_ART_ragPair_90 = 95;
  public static final int ARTL_ART_ragPair_81 = 96;
  public static final int ARTL_ART_ragPair_82 = 97;
  public static final int ARTL_ART_ragPair_85 = 98;
  public static final int ARTL_ART_ragPair_89 = 99;
  public static final int ARTL_ART_ragQuery_104 = 100;
  public static final int ARTL_ART_ragQuery_106 = 101;
  public static final int ARTL_ART_ragQuery_108 = 102;
  public static final int ARTL_ART_ragQuery_110 = 103;
  public static final int ARTL_ART_ragQuery_112 = 104;
  public static final int ARTL_ART_ragQuery_114 = 105;
  public static final int ARTL_ART_ragQuery_111 = 106;
  public static final int ARTL_ART_ragRewrite_26 = 107;
  public static final int ARTL_ART_ragRewrite_28 = 108;
  public static final int ARTL_ART_ragRewrite_30 = 109;
  public static final int ARTL_ART_ragRewrite_32 = 110;
  public static final int ARTL_ART_ragRewrite_29 = 111;
  public static final int ARTL_ART_ragRule_34 = 112;
  public static final int ARTL_ART_ragRule_36 = 113;
  public static final int ARTL_ART_ragRule_38 = 114;
  public static final int ARTL_ART_ragRule_40 = 115;
  public static final int ARTL_ART_ragRule_37 = 116;
  public static final int ARTL_ART_ragRuleRHS_42 = 117;
  public static final int ARTL_ART_ragRuleRHS_44 = 118;
  public static final int ARTL_ART_ragRuleRHS_46 = 119;
  public static final int ARTL_ART_ragRuleRHS_48 = 120;
  public static final int ARTL_ART_ragRuleRHS_50 = 121;
  public static final int ARTL_ART_ragRuleRHS_52 = 122;
  public static final int ARTL_ART_ragRules_16 = 123;
  public static final int ARTL_ART_ragRules_18 = 124;
  public static final int ARTL_ART_ragRules_20 = 125;
  public static final int ARTL_ART_ragRules_22 = 126;
  public static final int ARTL_ART_ragRules_24 = 127;
  public static final int ARTL_ART_ragStart_2 = 128;
  public static final int ARTL_ART_ragStart_4 = 129;
  public static final int ARTL_ART_ragStart_6 = 130;
  public static final int ARTL_ART_ragSymbol_162 = 131;
  public static final int ARTL_ART_ragSymbol_164 = 132;
  public static final int ARTL_ART_ragSymbol_163 = 133;
  public static final int ARTL_ART_ragSymbol_166 = 134;
  public static final int ARTL_ART_ragSymbol_168 = 135;
  public static final int ARTL_ART_ragSymbol_167 = 136;
  public static final int ARTL_ART_ragUnion_92 = 137;
  public static final int ARTL_ART_ragUnion_94 = 138;
  public static final int ARTL_ART_ragUnion_96 = 139;
  public static final int ARTL_ART_ragUnion_98 = 140;
  public static final int ARTL_ART_ragUnion_100 = 141;
  public static final int ARTL_ART_ragUnion_102 = 142;
  public static final int ARTL_ART_ragUnion_99 = 143;
  public static final int ARTX_DESPATCH = 144;
  public static final int ARTX_DUMMY = 145;
  public static final int ARTX_LABEL_EXTENT = 146;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_ragCat() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragCat production descriptor loads*/
      case ARTL_ART_ragCat: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragCat_54, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragCat_58, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragCat: match production*/
      case ARTL_ART_ragCat_54: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragCat_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragPair; return; }
      case ARTL_ART_ragCat_56: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragCat: match production*/
      case ARTL_ART_ragCat_58: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragCat_60, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragPair; return; }
      case ARTL_ART_ragCat_60: 
        /* Nonterminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragCat_62, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragCat; return; }
      case ARTL_ART_ragCat_62: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragElement() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragElement production descriptor loads*/
      case ARTL_ART_ragElement: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragElement_126, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragElement_130, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet9[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragElement_134, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragElement: match production*/
      case ARTL_ART_ragElement_126: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragElement_128, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragSymbol; return; }
      case ARTL_ART_ragElement_128: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragElement: match production*/
      case ARTL_ART_ragElement_130: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragElement_132, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragMap; return; }
      case ARTL_ART_ragElement_132: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragElement: match production*/
      case ARTL_ART_ragElement_134: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragElement_136, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragElement_138, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragPair; return; }
      case ARTL_ART_ragElement_138: 
        /* Nonterminal template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragElement_140, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragEmptySet() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragEmptySet production descriptor loads*/
      case ARTL_ART_ragEmptySet: 
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragEmptySet_158, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragEmptySet: match production*/
      case ARTL_ART_ragEmptySet_158: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE_RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragEmptySet_160, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragEmptyString() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragEmptyString production descriptor loads*/
      case ARTL_ART_ragEmptyString: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragEmptyString_154, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragEmptyString: match production*/
      case ARTL_ART_ragEmptyString_154: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragEmptyString_156, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragInverse() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragInverse production descriptor loads*/
      case ARTL_ART_ragInverse: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragInverse_116, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragInverse_120, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragInverse: match production*/
      case ARTL_ART_ragInverse_116: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragInverse_118, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragElement; return; }
      case ARTL_ART_ragInverse_118: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragInverse: match production*/
      case ARTL_ART_ragInverse_120: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragInverse_122, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragInverse_124, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragPair; return; }
      case ARTL_ART_ragInverse_124: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragMap() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragMap production descriptor loads*/
      case ARTL_ART_ragMap: 
        if (ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragMap_142, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragMap: match production*/
      case ARTL_ART_ragMap_142: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragMap_144, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragMap_146, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragElement; return; }
      case ARTL_ART_ragMap_146: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragMap_148, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragMap_150, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragElement; return; }
      case ARTL_ART_ragMap_150: 
        /* Nonterminal template end */
        if (!ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragMap_152, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragName() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragName production descriptor loads*/
      case ARTL_ART_ragName: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragName_8, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragName: match production*/
      case ARTL_ART_ragName_8: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Name_COLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragName_10, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragName_12, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragName_14, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragPair() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragPair production descriptor loads*/
      case ARTL_ART_ragPair: 
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragPair_64, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragPair_68, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet22[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragPair_80, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragPair: match production*/
      case ARTL_ART_ragPair_64: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragPair_66, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragUnion; return; }
      case ARTL_ART_ragPair_66: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragPair: match production*/
      case ARTL_ART_ragPair_68: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragPair_70, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragPair_72, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragUnion; return; }
      case ARTL_ART_ragPair_72: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragPair_74, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragPair_76, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragPair; return; }
      case ARTL_ART_ragPair_76: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragPair_78, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragPair: match production*/
      case ARTL_ART_ragPair_80: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragPair_82, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragPair_84, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragUnion; return; }
      case ARTL_ART_ragPair_84: 
        /* Nonterminal template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragPair_86, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragPair_88, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragEmptyString; return; }
      case ARTL_ART_ragPair_88: 
        /* Nonterminal template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragPair_90, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragQuery() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragQuery production descriptor loads*/
      case ARTL_ART_ragQuery: 
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragQuery_104, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragQuery_108, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragQuery: match production*/
      case ARTL_ART_ragQuery_104: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragQuery_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragInverse; return; }
      case ARTL_ART_ragQuery_106: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragQuery: match production*/
      case ARTL_ART_ragQuery_108: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragQuery_110, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragInverse; return; }
      case ARTL_ART_ragQuery_110: 
        /* Nonterminal template end */
        if (!ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__QUERY, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragQuery_112, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragQuery_114, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragQuery; return; }
      case ARTL_ART_ragQuery_114: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragRewrite() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragRewrite production descriptor loads*/
      case ARTL_ART_ragRewrite: 
        if (ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragRewrite_26, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragRewrite: match production*/
      case ARTL_ART_ragRewrite_26: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRewrite_28, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragSymbol; return; }
      case ARTL_ART_ragRewrite_28: 
        /* Nonterminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragRewrite_30, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRewrite_32, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragRules; return; }
      case ARTL_ART_ragRewrite_32: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet1[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragRule() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragRule production descriptor loads*/
      case ARTL_ART_ragRule: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragRule_34, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragRule: match production*/
      case ARTL_ART_ragRule_34: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRule_36, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragPair; return; }
      case ARTL_ART_ragRule_36: 
        /* Nonterminal template end */
        if (!ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS_GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragRule_38, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRule_40, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragRuleRHS; return; }
      case ARTL_ART_ragRule_40: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragRuleRHS() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragRuleRHS production descriptor loads*/
      case ARTL_ART_ragRuleRHS: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragRuleRHS_42, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragRuleRHS_46, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragRuleRHS_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragRuleRHS: match production*/
      case ARTL_ART_ragRuleRHS_42: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRuleRHS_44, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragEmptyString; return; }
      case ARTL_ART_ragRuleRHS_44: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragRuleRHS: match production*/
      case ARTL_ART_ragRuleRHS_46: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRuleRHS_48, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragEmptySet; return; }
      case ARTL_ART_ragRuleRHS_48: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragRuleRHS: match production*/
      case ARTL_ART_ragRuleRHS_50: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRuleRHS_52, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragCat; return; }
      case ARTL_ART_ragRuleRHS_52: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragRules() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragRules production descriptor loads*/
      case ARTL_ART_ragRules: 
        if (ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragRules_16, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragRules_20, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragRules: match production*/
      case ARTL_ART_ragRules_16: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragRules_18, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragRules: match production*/
      case ARTL_ART_ragRules_20: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRules_22, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragRule; return; }
      case ARTL_ART_ragRules_22: 
        /* Nonterminal template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragRules_24, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragRules; return; }
      case ARTL_ART_ragRules_24: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragStart() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragStart production descriptor loads*/
      case ARTL_ART_ragStart: 
        if (ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragStart_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragStart: match production*/
      case ARTL_ART_ragStart_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragStart_4, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragName; return; }
      case ARTL_ART_ragStart_4: 
        /* Nonterminal template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragStart_6, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragRules; return; }
      case ARTL_ART_ragStart_6: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragSymbol() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragSymbol production descriptor loads*/
      case ARTL_ART_ragSymbol: 
        if (ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragSymbol_162, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragSymbol_166, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragSymbol: match production*/
      case ARTL_ART_ragSymbol_162: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragSymbol_164, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragSymbol: match production*/
      case ARTL_ART_ragSymbol_166: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_DQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragSymbol_168, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ragUnion() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ragUnion production descriptor loads*/
      case ARTL_ART_ragUnion: 
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragUnion_92, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ragUnion_96, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ragUnion: match production*/
      case ARTL_ART_ragUnion_92: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragUnion_94, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragQuery; return; }
      case ARTL_ART_ragUnion_94: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal ragUnion: match production*/
      case ARTL_ART_ragUnion_96: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragUnion_98, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragUnion; return; }
      case ARTL_ART_ragUnion_98: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__BACKSLASH_SLASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ragUnion_100, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_ragUnion_102, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ragQuery; return; }
      case ARTL_ART_ragUnion_102: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artLexicaliseUsingLongestMatch(artInputString);
    artLexCompleteTime = artReadClock();
    artDummySPPFNode = artFindSPPFInitial(ARTL_DUMMY, 0, 0);
    artCurrentSPPFNode = artDummySPPFNode;
    artRootGSSNode = artFindGSS(ARTL_EOS, 0, 0, 0);
    artCurrentGSSNode = artRootGSSNode;
    artCurrentRestartLabel = artStartSymbolLabel;
    artCurrentInputPairIndex = 0;
    artCurrentInputPairReference = 0;
    while (true)
      switch (artlhsL[artCurrentRestartLabel]) {
        case ARTL_ART_ragCat: 
          ARTPF_ART_ragCat();
          break;
        case ARTL_ART_ragElement: 
          ARTPF_ART_ragElement();
          break;
        case ARTL_ART_ragEmptySet: 
          ARTPF_ART_ragEmptySet();
          break;
        case ARTL_ART_ragEmptyString: 
          ARTPF_ART_ragEmptyString();
          break;
        case ARTL_ART_ragInverse: 
          ARTPF_ART_ragInverse();
          break;
        case ARTL_ART_ragMap: 
          ARTPF_ART_ragMap();
          break;
        case ARTL_ART_ragName: 
          ARTPF_ART_ragName();
          break;
        case ARTL_ART_ragPair: 
          ARTPF_ART_ragPair();
          break;
        case ARTL_ART_ragQuery: 
          ARTPF_ART_ragQuery();
          break;
        case ARTL_ART_ragRewrite: 
          ARTPF_ART_ragRewrite();
          break;
        case ARTL_ART_ragRule: 
          ARTPF_ART_ragRule();
          break;
        case ARTL_ART_ragRuleRHS: 
          ARTPF_ART_ragRuleRHS();
          break;
        case ARTL_ART_ragRules: 
          ARTPF_ART_ragRules();
          break;
        case ARTL_ART_ragStart: 
          ARTPF_ART_ragStart();
          break;
        case ARTL_ART_ragSymbol: 
          ARTPF_ART_ragSymbol();
          break;
        case ARTL_ART_ragUnion: 
          ARTPF_ART_ragUnion();
          break;
        case ARTX_DESPATCH: 
          if (artNoDescriptors()) { 
            artCheckAcceptance();
            artParseCompleteTime = artReadClock();
            return;
           }
          artUnloadDescriptor();
      }
  }

  public void ARTSet1initialise() {
    ARTSet1 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet1, 0, artSetExtent, false);
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTB_ID] = true;
    ARTSet7[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTX_EOS] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTB_ID] = true;
    ARTSet26[ARTTB_STRING_DQ] = true;
    ARTSet26[ARTTS__SHREIK] = true;
    ARTSet26[ARTTS__LPAR] = true;
    ARTSet26[ARTTS__LT] = true;
    ARTSet26[ARTTS__LBRACK] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTX_EOS] = true;
    ARTSet13[ARTTB_ID] = true;
    ARTSet13[ARTTB_STRING_DQ] = true;
    ARTSet13[ARTTS__SHREIK] = true;
    ARTSet13[ARTTS__LPAR] = true;
    ARTSet13[ARTTS__LT] = true;
    ARTSet13[ARTTS__GT] = true;
    ARTSet13[ARTTS__LBRACK] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTTB_ID] = true;
    ARTSet28[ARTTB_STRING_DQ] = true;
    ARTSet28[ARTTS__SHREIK] = true;
    ARTSet28[ARTTS__HASH] = true;
    ARTSet28[ARTTS__LPAR] = true;
    ARTSet28[ARTTS__LT] = true;
    ARTSet28[ARTTS__LBRACK] = true;
    ARTSet28[ARTTS__LBRACE_RBRACE] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS__BACKSLASH_SLASH] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS_Name_COLON] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTS__LBRACK] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTS__RBRACK] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTB_ID] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_ID] = true;
    ARTSet5[ARTTB_STRING_DQ] = true;
    ARTSet5[ARTTS__LPAR] = true;
    ARTSet5[ARTTS__LBRACK] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTS__SHREIK] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTS__LBRACE_RBRACE] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTS__HASH] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTX_EOS] = true;
    ARTSet30[ARTTB_ID] = true;
    ARTSet30[ARTTB_STRING_DQ] = true;
    ARTSet30[ARTTS__SHREIK] = true;
    ARTSet30[ARTTS__LPAR] = true;
    ARTSet30[ARTTS__RPAR] = true;
    ARTSet30[ARTTS__COMMA] = true;
    ARTSet30[ARTTS__MINUS_GT] = true;
    ARTSet30[ARTTS__COLON] = true;
    ARTSet30[ARTTS__LT] = true;
    ARTSet30[ARTTS__GT] = true;
    ARTSet30[ARTTS__QUERY] = true;
    ARTSet30[ARTTS__LBRACK] = true;
    ARTSet30[ARTTS__BACKSLASH_SLASH] = true;
    ARTSet30[ARTTS__RBRACK] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTS__LPAR] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTTS__RPAR] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTTS__COMMA] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTB_STRING_DQ] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTX_EOS] = true;
    ARTSet6[ARTTB_ID] = true;
    ARTSet6[ARTTB_STRING_DQ] = true;
    ARTSet6[ARTTS__SHREIK] = true;
    ARTSet6[ARTTS__LPAR] = true;
    ARTSet6[ARTTS__RPAR] = true;
    ARTSet6[ARTTS__COMMA] = true;
    ARTSet6[ARTTS__MINUS_GT] = true;
    ARTSet6[ARTTS__LT] = true;
    ARTSet6[ARTTS__GT] = true;
    ARTSet6[ARTTS__QUERY] = true;
    ARTSet6[ARTTS__LBRACK] = true;
    ARTSet6[ARTTS__BACKSLASH_SLASH] = true;
    ARTSet6[ARTTS__RBRACK] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS__MINUS_GT] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
    ARTSet2[ARTTB_STRING_DQ] = true;
    ARTSet2[ARTTS__SHREIK] = true;
    ARTSet2[ARTTS__LPAR] = true;
    ARTSet2[ARTTS__LT] = true;
    ARTSet2[ARTTS__LBRACK] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTX_EOS] = true;
    ARTSet15[ARTTB_ID] = true;
    ARTSet15[ARTTB_STRING_DQ] = true;
    ARTSet15[ARTTS__SHREIK] = true;
    ARTSet15[ARTTS__LPAR] = true;
    ARTSet15[ARTTS__RPAR] = true;
    ARTSet15[ARTTS__COMMA] = true;
    ARTSet15[ARTTS__MINUS_GT] = true;
    ARTSet15[ARTTS__LT] = true;
    ARTSet15[ARTTS__GT] = true;
    ARTSet15[ARTTS__QUERY] = true;
    ARTSet15[ARTTS__LBRACK] = true;
    ARTSet15[ARTTS__BACKSLASH_SLASH] = true;
  }

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTX_EOS] = true;
    ARTSet3[ARTTB_ID] = true;
    ARTSet3[ARTTB_STRING_DQ] = true;
    ARTSet3[ARTTS__SHREIK] = true;
    ARTSet3[ARTTS__LPAR] = true;
    ARTSet3[ARTTS__LT] = true;
    ARTSet3[ARTTS__LBRACK] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS__COLON] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTS__LT] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTB_ID] = true;
    ARTSet14[ARTTB_STRING_DQ] = true;
    ARTSet14[ARTTS__SHREIK] = true;
    ARTSet14[ARTTS__LPAR] = true;
    ARTSet14[ARTTS__LBRACK] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTS__GT] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS__QUERY] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet7initialise();
    ARTSet29initialise();
    ARTSet26initialise();
    ARTSet13initialise();
    ARTSet28initialise();
    ARTSet32initialise();
    ARTSet19initialise();
    ARTSet8initialise();
    ARTSet18initialise();
    ARTSet31initialise();
    ARTSet5initialise();
    ARTSet16initialise();
    ARTSet11initialise();
    ARTSet12initialise();
    ARTSet30initialise();
    ARTSet9initialise();
    ARTSet10initialise();
    ARTSet17initialise();
    ARTSet20initialise();
    ARTSet6initialise();
    ARTSet27initialise();
    ARTSet2initialise();
    ARTSet15initialise();
    ARTSet3initialise();
    ARTSet25initialise();
    ARTSet21initialise();
    ARTSet22initialise();
    ARTSet4initialise();
    ARTSet14initialise();
    ARTSet23initialise();
    ARTSet24initialise();
  }

  public void artTableInitialiser_ART_ragCat() {
    artLabelInternalStrings[ARTL_ART_ragCat] = "ragCat";
    artLabelStrings[ARTL_ART_ragCat] = "ragCat";
    artKindOfs[ARTL_ART_ragCat] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragCat_54] = "ragCat ::= . ragPair ";
    artLabelStrings[ARTL_ART_ragCat_54] = "";
    artlhsL[ARTL_ART_ragCat_54] = ARTL_ART_ragCat;
    artKindOfs[ARTL_ART_ragCat_54] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragCat_56] = "ragCat ::= ragPair .";
    artLabelStrings[ARTL_ART_ragCat_56] = "";
    artlhsL[ARTL_ART_ragCat_56] = ARTL_ART_ragCat;
    artSlotInstanceOfs[ARTL_ART_ragCat_56] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragCat_56] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragCat_56] = true;
    arteoR_pL[ARTL_ART_ragCat_56] = true;
    artPopD[ARTL_ART_ragCat_56] = true;
    artLabelInternalStrings[ARTL_ART_ragCat_58] = "ragCat ::= . ragPair ragCat ";
    artLabelStrings[ARTL_ART_ragCat_58] = "";
    artlhsL[ARTL_ART_ragCat_58] = ARTL_ART_ragCat;
    artKindOfs[ARTL_ART_ragCat_58] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragCat_60] = "ragCat ::= ragPair . ragCat ";
    artLabelStrings[ARTL_ART_ragCat_60] = "";
    artlhsL[ARTL_ART_ragCat_60] = ARTL_ART_ragCat;
    artSlotInstanceOfs[ARTL_ART_ragCat_60] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragCat_60] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragCat_60] = true;
    artLabelInternalStrings[ARTL_ART_ragCat_62] = "ragCat ::= ragPair ragCat .";
    artLabelStrings[ARTL_ART_ragCat_62] = "";
    artlhsL[ARTL_ART_ragCat_62] = ARTL_ART_ragCat;
    artSlotInstanceOfs[ARTL_ART_ragCat_62] = ARTL_ART_ragCat;
    artKindOfs[ARTL_ART_ragCat_62] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragCat_62] = true;
    arteoR_pL[ARTL_ART_ragCat_62] = true;
    artPopD[ARTL_ART_ragCat_62] = true;
  }

  public void artTableInitialiser_ART_ragElement() {
    artLabelInternalStrings[ARTL_ART_ragElement] = "ragElement";
    artLabelStrings[ARTL_ART_ragElement] = "ragElement";
    artKindOfs[ARTL_ART_ragElement] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragElement_126] = "ragElement ::= . ragSymbol ";
    artLabelStrings[ARTL_ART_ragElement_126] = "";
    artlhsL[ARTL_ART_ragElement_126] = ARTL_ART_ragElement;
    artKindOfs[ARTL_ART_ragElement_126] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragElement_128] = "ragElement ::= ragSymbol .";
    artLabelStrings[ARTL_ART_ragElement_128] = "";
    artlhsL[ARTL_ART_ragElement_128] = ARTL_ART_ragElement;
    artSlotInstanceOfs[ARTL_ART_ragElement_128] = ARTL_ART_ragSymbol;
    artKindOfs[ARTL_ART_ragElement_128] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragElement_128] = true;
    arteoR_pL[ARTL_ART_ragElement_128] = true;
    artPopD[ARTL_ART_ragElement_128] = true;
    artLabelInternalStrings[ARTL_ART_ragElement_130] = "ragElement ::= . ragMap ";
    artLabelStrings[ARTL_ART_ragElement_130] = "";
    artlhsL[ARTL_ART_ragElement_130] = ARTL_ART_ragElement;
    artKindOfs[ARTL_ART_ragElement_130] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragElement_132] = "ragElement ::= ragMap .";
    artLabelStrings[ARTL_ART_ragElement_132] = "";
    artlhsL[ARTL_ART_ragElement_132] = ARTL_ART_ragElement;
    artSlotInstanceOfs[ARTL_ART_ragElement_132] = ARTL_ART_ragMap;
    artKindOfs[ARTL_ART_ragElement_132] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragElement_132] = true;
    arteoR_pL[ARTL_ART_ragElement_132] = true;
    artPopD[ARTL_ART_ragElement_132] = true;
    artLabelInternalStrings[ARTL_ART_ragElement_134] = "ragElement ::= . '(' ragPair ')' ";
    artLabelStrings[ARTL_ART_ragElement_134] = "";
    artlhsL[ARTL_ART_ragElement_134] = ARTL_ART_ragElement;
    artKindOfs[ARTL_ART_ragElement_134] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragElement_135] = "ragElement ::= '(' ragPair ')' ";
    artLabelStrings[ARTL_ART_ragElement_135] = "";
    artlhsL[ARTL_ART_ragElement_135] = ARTL_ART_ragElement;
    artLabelInternalStrings[ARTL_ART_ragElement_136] = "ragElement ::= '(' . ragPair ')' ";
    artLabelStrings[ARTL_ART_ragElement_136] = "";
    artlhsL[ARTL_ART_ragElement_136] = ARTL_ART_ragElement;
    artKindOfs[ARTL_ART_ragElement_136] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragElement_136] = true;
    artLabelInternalStrings[ARTL_ART_ragElement_138] = "ragElement ::= '(' ragPair . ')' ";
    artLabelStrings[ARTL_ART_ragElement_138] = "";
    artlhsL[ARTL_ART_ragElement_138] = ARTL_ART_ragElement;
    artSlotInstanceOfs[ARTL_ART_ragElement_138] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragElement_138] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragElement_138] = true;
    artLabelInternalStrings[ARTL_ART_ragElement_139] = "ragElement ::= '(' ragPair ')' ";
    artLabelStrings[ARTL_ART_ragElement_139] = "";
    artlhsL[ARTL_ART_ragElement_139] = ARTL_ART_ragElement;
    artPopD[ARTL_ART_ragElement_139] = true;
    artLabelInternalStrings[ARTL_ART_ragElement_140] = "ragElement ::= '(' ragPair ')' .";
    artLabelStrings[ARTL_ART_ragElement_140] = "";
    artlhsL[ARTL_ART_ragElement_140] = ARTL_ART_ragElement;
    artKindOfs[ARTL_ART_ragElement_140] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragElement_140] = true;
    arteoR_pL[ARTL_ART_ragElement_140] = true;
    artPopD[ARTL_ART_ragElement_140] = true;
  }

  public void artTableInitialiser_ART_ragEmptySet() {
    artLabelInternalStrings[ARTL_ART_ragEmptySet] = "ragEmptySet";
    artLabelStrings[ARTL_ART_ragEmptySet] = "ragEmptySet";
    artKindOfs[ARTL_ART_ragEmptySet] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragEmptySet_158] = "ragEmptySet ::= . '{}' ";
    artLabelStrings[ARTL_ART_ragEmptySet_158] = "";
    artlhsL[ARTL_ART_ragEmptySet_158] = ARTL_ART_ragEmptySet;
    artKindOfs[ARTL_ART_ragEmptySet_158] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragEmptySet_158] = true;
    artLabelInternalStrings[ARTL_ART_ragEmptySet_159] = "ragEmptySet ::= '{}' ";
    artLabelStrings[ARTL_ART_ragEmptySet_159] = "";
    artlhsL[ARTL_ART_ragEmptySet_159] = ARTL_ART_ragEmptySet;
    artPopD[ARTL_ART_ragEmptySet_159] = true;
    artLabelInternalStrings[ARTL_ART_ragEmptySet_160] = "ragEmptySet ::= '{}' .";
    artLabelStrings[ARTL_ART_ragEmptySet_160] = "";
    artlhsL[ARTL_ART_ragEmptySet_160] = ARTL_ART_ragEmptySet;
    artKindOfs[ARTL_ART_ragEmptySet_160] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragEmptySet_160] = true;
    arteoR_pL[ARTL_ART_ragEmptySet_160] = true;
    artPopD[ARTL_ART_ragEmptySet_160] = true;
  }

  public void artTableInitialiser_ART_ragEmptyString() {
    artLabelInternalStrings[ARTL_ART_ragEmptyString] = "ragEmptyString";
    artLabelStrings[ARTL_ART_ragEmptyString] = "ragEmptyString";
    artKindOfs[ARTL_ART_ragEmptyString] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragEmptyString_154] = "ragEmptyString ::= . '#' ";
    artLabelStrings[ARTL_ART_ragEmptyString_154] = "";
    artlhsL[ARTL_ART_ragEmptyString_154] = ARTL_ART_ragEmptyString;
    artKindOfs[ARTL_ART_ragEmptyString_154] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragEmptyString_154] = true;
    artLabelInternalStrings[ARTL_ART_ragEmptyString_155] = "ragEmptyString ::= '#' ";
    artLabelStrings[ARTL_ART_ragEmptyString_155] = "";
    artlhsL[ARTL_ART_ragEmptyString_155] = ARTL_ART_ragEmptyString;
    artPopD[ARTL_ART_ragEmptyString_155] = true;
    artLabelInternalStrings[ARTL_ART_ragEmptyString_156] = "ragEmptyString ::= '#' .";
    artLabelStrings[ARTL_ART_ragEmptyString_156] = "";
    artlhsL[ARTL_ART_ragEmptyString_156] = ARTL_ART_ragEmptyString;
    artKindOfs[ARTL_ART_ragEmptyString_156] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragEmptyString_156] = true;
    arteoR_pL[ARTL_ART_ragEmptyString_156] = true;
    artPopD[ARTL_ART_ragEmptyString_156] = true;
  }

  public void artTableInitialiser_ART_ragInverse() {
    artLabelInternalStrings[ARTL_ART_ragInverse] = "ragInverse";
    artLabelStrings[ARTL_ART_ragInverse] = "ragInverse";
    artKindOfs[ARTL_ART_ragInverse] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragInverse_116] = "ragInverse ::= . ragElement ";
    artLabelStrings[ARTL_ART_ragInverse_116] = "";
    artlhsL[ARTL_ART_ragInverse_116] = ARTL_ART_ragInverse;
    artKindOfs[ARTL_ART_ragInverse_116] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragInverse_118] = "ragInverse ::= ragElement .";
    artLabelStrings[ARTL_ART_ragInverse_118] = "";
    artlhsL[ARTL_ART_ragInverse_118] = ARTL_ART_ragInverse;
    artSlotInstanceOfs[ARTL_ART_ragInverse_118] = ARTL_ART_ragElement;
    artKindOfs[ARTL_ART_ragInverse_118] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragInverse_118] = true;
    arteoR_pL[ARTL_ART_ragInverse_118] = true;
    artPopD[ARTL_ART_ragInverse_118] = true;
    artLabelInternalStrings[ARTL_ART_ragInverse_120] = "ragInverse ::= . '!' ragPair ";
    artLabelStrings[ARTL_ART_ragInverse_120] = "";
    artlhsL[ARTL_ART_ragInverse_120] = ARTL_ART_ragInverse;
    artKindOfs[ARTL_ART_ragInverse_120] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragInverse_121] = "ragInverse ::= '!' ragPair ";
    artLabelStrings[ARTL_ART_ragInverse_121] = "";
    artlhsL[ARTL_ART_ragInverse_121] = ARTL_ART_ragInverse;
    artLabelInternalStrings[ARTL_ART_ragInverse_122] = "ragInverse ::= '!' . ragPair ";
    artLabelStrings[ARTL_ART_ragInverse_122] = "";
    artlhsL[ARTL_ART_ragInverse_122] = ARTL_ART_ragInverse;
    artKindOfs[ARTL_ART_ragInverse_122] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragInverse_122] = true;
    artLabelInternalStrings[ARTL_ART_ragInverse_124] = "ragInverse ::= '!' ragPair .";
    artLabelStrings[ARTL_ART_ragInverse_124] = "";
    artlhsL[ARTL_ART_ragInverse_124] = ARTL_ART_ragInverse;
    artSlotInstanceOfs[ARTL_ART_ragInverse_124] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragInverse_124] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragInverse_124] = true;
    arteoR_pL[ARTL_ART_ragInverse_124] = true;
    artPopD[ARTL_ART_ragInverse_124] = true;
  }

  public void artTableInitialiser_ART_ragMap() {
    artLabelInternalStrings[ARTL_ART_ragMap] = "ragMap";
    artLabelStrings[ARTL_ART_ragMap] = "ragMap";
    artKindOfs[ARTL_ART_ragMap] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragMap_142] = "ragMap ::= . '[' ragElement ',' ragElement ']' ";
    artLabelStrings[ARTL_ART_ragMap_142] = "";
    artlhsL[ARTL_ART_ragMap_142] = ARTL_ART_ragMap;
    artKindOfs[ARTL_ART_ragMap_142] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragMap_143] = "ragMap ::= '[' ragElement ',' ragElement ']' ";
    artLabelStrings[ARTL_ART_ragMap_143] = "";
    artlhsL[ARTL_ART_ragMap_143] = ARTL_ART_ragMap;
    artLabelInternalStrings[ARTL_ART_ragMap_144] = "ragMap ::= '[' . ragElement ',' ragElement ']' ";
    artLabelStrings[ARTL_ART_ragMap_144] = "";
    artlhsL[ARTL_ART_ragMap_144] = ARTL_ART_ragMap;
    artKindOfs[ARTL_ART_ragMap_144] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragMap_144] = true;
    artLabelInternalStrings[ARTL_ART_ragMap_146] = "ragMap ::= '[' ragElement . ',' ragElement ']' ";
    artLabelStrings[ARTL_ART_ragMap_146] = "";
    artlhsL[ARTL_ART_ragMap_146] = ARTL_ART_ragMap;
    artSlotInstanceOfs[ARTL_ART_ragMap_146] = ARTL_ART_ragElement;
    artKindOfs[ARTL_ART_ragMap_146] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragMap_147] = "ragMap ::= '[' ragElement ',' ragElement ']' ";
    artLabelStrings[ARTL_ART_ragMap_147] = "";
    artlhsL[ARTL_ART_ragMap_147] = ARTL_ART_ragMap;
    artLabelInternalStrings[ARTL_ART_ragMap_148] = "ragMap ::= '[' ragElement ',' . ragElement ']' ";
    artLabelStrings[ARTL_ART_ragMap_148] = "";
    artlhsL[ARTL_ART_ragMap_148] = ARTL_ART_ragMap;
    artKindOfs[ARTL_ART_ragMap_148] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragMap_150] = "ragMap ::= '[' ragElement ',' ragElement . ']' ";
    artLabelStrings[ARTL_ART_ragMap_150] = "";
    artlhsL[ARTL_ART_ragMap_150] = ARTL_ART_ragMap;
    artSlotInstanceOfs[ARTL_ART_ragMap_150] = ARTL_ART_ragElement;
    artKindOfs[ARTL_ART_ragMap_150] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragMap_150] = true;
    artLabelInternalStrings[ARTL_ART_ragMap_151] = "ragMap ::= '[' ragElement ',' ragElement ']' ";
    artLabelStrings[ARTL_ART_ragMap_151] = "";
    artlhsL[ARTL_ART_ragMap_151] = ARTL_ART_ragMap;
    artPopD[ARTL_ART_ragMap_151] = true;
    artLabelInternalStrings[ARTL_ART_ragMap_152] = "ragMap ::= '[' ragElement ',' ragElement ']' .";
    artLabelStrings[ARTL_ART_ragMap_152] = "";
    artlhsL[ARTL_ART_ragMap_152] = ARTL_ART_ragMap;
    artKindOfs[ARTL_ART_ragMap_152] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragMap_152] = true;
    arteoR_pL[ARTL_ART_ragMap_152] = true;
    artPopD[ARTL_ART_ragMap_152] = true;
  }

  public void artTableInitialiser_ART_ragName() {
    artLabelInternalStrings[ARTL_ART_ragName] = "ragName";
    artLabelStrings[ARTL_ART_ragName] = "ragName";
    artKindOfs[ARTL_ART_ragName] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragName_8] = "ragName ::= . 'Name:' &STRING_DQ ';' ";
    artLabelStrings[ARTL_ART_ragName_8] = "";
    artlhsL[ARTL_ART_ragName_8] = ARTL_ART_ragName;
    artKindOfs[ARTL_ART_ragName_8] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragName_8] = true;
    artLabelInternalStrings[ARTL_ART_ragName_9] = "ragName ::= 'Name:' &STRING_DQ ';' ";
    artLabelStrings[ARTL_ART_ragName_9] = "";
    artlhsL[ARTL_ART_ragName_9] = ARTL_ART_ragName;
    artPopD[ARTL_ART_ragName_9] = true;
    artLabelInternalStrings[ARTL_ART_ragName_10] = "ragName ::= 'Name:' . &STRING_DQ ';' ";
    artLabelStrings[ARTL_ART_ragName_10] = "";
    artlhsL[ARTL_ART_ragName_10] = ARTL_ART_ragName;
    artKindOfs[ARTL_ART_ragName_10] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragName_10] = true;
    artPopD[ARTL_ART_ragName_10] = true;
    artLabelInternalStrings[ARTL_ART_ragName_11] = "ragName ::= 'Name:' &STRING_DQ ';' ";
    artLabelStrings[ARTL_ART_ragName_11] = "";
    artlhsL[ARTL_ART_ragName_11] = ARTL_ART_ragName;
    artPopD[ARTL_ART_ragName_11] = true;
    artLabelInternalStrings[ARTL_ART_ragName_12] = "ragName ::= 'Name:' &STRING_DQ . ';' ";
    artLabelStrings[ARTL_ART_ragName_12] = "";
    artlhsL[ARTL_ART_ragName_12] = ARTL_ART_ragName;
    artKindOfs[ARTL_ART_ragName_12] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragName_12] = true;
    artLabelInternalStrings[ARTL_ART_ragName_13] = "ragName ::= 'Name:' &STRING_DQ ';' ";
    artLabelStrings[ARTL_ART_ragName_13] = "";
    artlhsL[ARTL_ART_ragName_13] = ARTL_ART_ragName;
    artPopD[ARTL_ART_ragName_13] = true;
    artLabelInternalStrings[ARTL_ART_ragName_14] = "ragName ::= 'Name:' &STRING_DQ ';' .";
    artLabelStrings[ARTL_ART_ragName_14] = "";
    artlhsL[ARTL_ART_ragName_14] = ARTL_ART_ragName;
    artKindOfs[ARTL_ART_ragName_14] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragName_14] = true;
    arteoR_pL[ARTL_ART_ragName_14] = true;
    artPopD[ARTL_ART_ragName_14] = true;
  }

  public void artTableInitialiser_ART_ragPair() {
    artLabelInternalStrings[ARTL_ART_ragPair] = "ragPair";
    artLabelStrings[ARTL_ART_ragPair] = "ragPair";
    artKindOfs[ARTL_ART_ragPair] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragPair_64] = "ragPair ::= . ragUnion ";
    artLabelStrings[ARTL_ART_ragPair_64] = "";
    artlhsL[ARTL_ART_ragPair_64] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_64] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragPair_66] = "ragPair ::= ragUnion .";
    artLabelStrings[ARTL_ART_ragPair_66] = "";
    artlhsL[ARTL_ART_ragPair_66] = ARTL_ART_ragPair;
    artSlotInstanceOfs[ARTL_ART_ragPair_66] = ARTL_ART_ragUnion;
    artKindOfs[ARTL_ART_ragPair_66] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragPair_66] = true;
    arteoR_pL[ARTL_ART_ragPair_66] = true;
    artPopD[ARTL_ART_ragPair_66] = true;
    artLabelInternalStrings[ARTL_ART_ragPair_68] = "ragPair ::= . '<' ragUnion ',' ragPair '>' ";
    artLabelStrings[ARTL_ART_ragPair_68] = "";
    artlhsL[ARTL_ART_ragPair_68] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_68] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragPair_69] = "ragPair ::= '<' ragUnion ',' ragPair '>' ";
    artLabelStrings[ARTL_ART_ragPair_69] = "";
    artlhsL[ARTL_ART_ragPair_69] = ARTL_ART_ragPair;
    artLabelInternalStrings[ARTL_ART_ragPair_70] = "ragPair ::= '<' . ragUnion ',' ragPair '>' ";
    artLabelStrings[ARTL_ART_ragPair_70] = "";
    artlhsL[ARTL_ART_ragPair_70] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_70] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragPair_70] = true;
    artLabelInternalStrings[ARTL_ART_ragPair_72] = "ragPair ::= '<' ragUnion . ',' ragPair '>' ";
    artLabelStrings[ARTL_ART_ragPair_72] = "";
    artlhsL[ARTL_ART_ragPair_72] = ARTL_ART_ragPair;
    artSlotInstanceOfs[ARTL_ART_ragPair_72] = ARTL_ART_ragUnion;
    artKindOfs[ARTL_ART_ragPair_72] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragPair_73] = "ragPair ::= '<' ragUnion ',' ragPair '>' ";
    artLabelStrings[ARTL_ART_ragPair_73] = "";
    artlhsL[ARTL_ART_ragPair_73] = ARTL_ART_ragPair;
    artLabelInternalStrings[ARTL_ART_ragPair_74] = "ragPair ::= '<' ragUnion ',' . ragPair '>' ";
    artLabelStrings[ARTL_ART_ragPair_74] = "";
    artlhsL[ARTL_ART_ragPair_74] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_74] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragPair_76] = "ragPair ::= '<' ragUnion ',' ragPair . '>' ";
    artLabelStrings[ARTL_ART_ragPair_76] = "";
    artlhsL[ARTL_ART_ragPair_76] = ARTL_ART_ragPair;
    artSlotInstanceOfs[ARTL_ART_ragPair_76] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_76] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragPair_76] = true;
    artLabelInternalStrings[ARTL_ART_ragPair_77] = "ragPair ::= '<' ragUnion ',' ragPair '>' ";
    artLabelStrings[ARTL_ART_ragPair_77] = "";
    artlhsL[ARTL_ART_ragPair_77] = ARTL_ART_ragPair;
    artPopD[ARTL_ART_ragPair_77] = true;
    artLabelInternalStrings[ARTL_ART_ragPair_78] = "ragPair ::= '<' ragUnion ',' ragPair '>' .";
    artLabelStrings[ARTL_ART_ragPair_78] = "";
    artlhsL[ARTL_ART_ragPair_78] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_78] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragPair_78] = true;
    arteoR_pL[ARTL_ART_ragPair_78] = true;
    artPopD[ARTL_ART_ragPair_78] = true;
    artLabelInternalStrings[ARTL_ART_ragPair_80] = "ragPair ::= . '<' ragUnion ',' ragEmptyString '>' ";
    artLabelStrings[ARTL_ART_ragPair_80] = "";
    artlhsL[ARTL_ART_ragPair_80] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_80] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragPair_81] = "ragPair ::= '<' ragUnion ',' ragEmptyString '>' ";
    artLabelStrings[ARTL_ART_ragPair_81] = "";
    artlhsL[ARTL_ART_ragPair_81] = ARTL_ART_ragPair;
    artLabelInternalStrings[ARTL_ART_ragPair_82] = "ragPair ::= '<' . ragUnion ',' ragEmptyString '>' ";
    artLabelStrings[ARTL_ART_ragPair_82] = "";
    artlhsL[ARTL_ART_ragPair_82] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_82] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragPair_82] = true;
    artLabelInternalStrings[ARTL_ART_ragPair_84] = "ragPair ::= '<' ragUnion . ',' ragEmptyString '>' ";
    artLabelStrings[ARTL_ART_ragPair_84] = "";
    artlhsL[ARTL_ART_ragPair_84] = ARTL_ART_ragPair;
    artSlotInstanceOfs[ARTL_ART_ragPair_84] = ARTL_ART_ragUnion;
    artKindOfs[ARTL_ART_ragPair_84] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragPair_85] = "ragPair ::= '<' ragUnion ',' ragEmptyString '>' ";
    artLabelStrings[ARTL_ART_ragPair_85] = "";
    artlhsL[ARTL_ART_ragPair_85] = ARTL_ART_ragPair;
    artLabelInternalStrings[ARTL_ART_ragPair_86] = "ragPair ::= '<' ragUnion ',' . ragEmptyString '>' ";
    artLabelStrings[ARTL_ART_ragPair_86] = "";
    artlhsL[ARTL_ART_ragPair_86] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_86] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragPair_88] = "ragPair ::= '<' ragUnion ',' ragEmptyString . '>' ";
    artLabelStrings[ARTL_ART_ragPair_88] = "";
    artlhsL[ARTL_ART_ragPair_88] = ARTL_ART_ragPair;
    artSlotInstanceOfs[ARTL_ART_ragPair_88] = ARTL_ART_ragEmptyString;
    artKindOfs[ARTL_ART_ragPair_88] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragPair_88] = true;
    artLabelInternalStrings[ARTL_ART_ragPair_89] = "ragPair ::= '<' ragUnion ',' ragEmptyString '>' ";
    artLabelStrings[ARTL_ART_ragPair_89] = "";
    artlhsL[ARTL_ART_ragPair_89] = ARTL_ART_ragPair;
    artPopD[ARTL_ART_ragPair_89] = true;
    artLabelInternalStrings[ARTL_ART_ragPair_90] = "ragPair ::= '<' ragUnion ',' ragEmptyString '>' .";
    artLabelStrings[ARTL_ART_ragPair_90] = "";
    artlhsL[ARTL_ART_ragPair_90] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragPair_90] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragPair_90] = true;
    arteoR_pL[ARTL_ART_ragPair_90] = true;
    artPopD[ARTL_ART_ragPair_90] = true;
  }

  public void artTableInitialiser_ART_ragQuery() {
    artLabelInternalStrings[ARTL_ART_ragQuery] = "ragQuery";
    artLabelStrings[ARTL_ART_ragQuery] = "ragQuery";
    artKindOfs[ARTL_ART_ragQuery] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragQuery_104] = "ragQuery ::= . ragInverse ";
    artLabelStrings[ARTL_ART_ragQuery_104] = "";
    artlhsL[ARTL_ART_ragQuery_104] = ARTL_ART_ragQuery;
    artKindOfs[ARTL_ART_ragQuery_104] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragQuery_106] = "ragQuery ::= ragInverse .";
    artLabelStrings[ARTL_ART_ragQuery_106] = "";
    artlhsL[ARTL_ART_ragQuery_106] = ARTL_ART_ragQuery;
    artSlotInstanceOfs[ARTL_ART_ragQuery_106] = ARTL_ART_ragInverse;
    artKindOfs[ARTL_ART_ragQuery_106] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragQuery_106] = true;
    arteoR_pL[ARTL_ART_ragQuery_106] = true;
    artPopD[ARTL_ART_ragQuery_106] = true;
    artLabelInternalStrings[ARTL_ART_ragQuery_108] = "ragQuery ::= . ragInverse '?' ragQuery ";
    artLabelStrings[ARTL_ART_ragQuery_108] = "";
    artlhsL[ARTL_ART_ragQuery_108] = ARTL_ART_ragQuery;
    artKindOfs[ARTL_ART_ragQuery_108] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragQuery_110] = "ragQuery ::= ragInverse . '?' ragQuery ";
    artLabelStrings[ARTL_ART_ragQuery_110] = "";
    artlhsL[ARTL_ART_ragQuery_110] = ARTL_ART_ragQuery;
    artSlotInstanceOfs[ARTL_ART_ragQuery_110] = ARTL_ART_ragInverse;
    artKindOfs[ARTL_ART_ragQuery_110] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragQuery_110] = true;
    artLabelInternalStrings[ARTL_ART_ragQuery_111] = "ragQuery ::= ragInverse '?' ragQuery ";
    artLabelStrings[ARTL_ART_ragQuery_111] = "";
    artlhsL[ARTL_ART_ragQuery_111] = ARTL_ART_ragQuery;
    artLabelInternalStrings[ARTL_ART_ragQuery_112] = "ragQuery ::= ragInverse '?' . ragQuery ";
    artLabelStrings[ARTL_ART_ragQuery_112] = "";
    artlhsL[ARTL_ART_ragQuery_112] = ARTL_ART_ragQuery;
    artKindOfs[ARTL_ART_ragQuery_112] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragQuery_114] = "ragQuery ::= ragInverse '?' ragQuery .";
    artLabelStrings[ARTL_ART_ragQuery_114] = "";
    artlhsL[ARTL_ART_ragQuery_114] = ARTL_ART_ragQuery;
    artSlotInstanceOfs[ARTL_ART_ragQuery_114] = ARTL_ART_ragQuery;
    artKindOfs[ARTL_ART_ragQuery_114] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragQuery_114] = true;
    arteoR_pL[ARTL_ART_ragQuery_114] = true;
    artPopD[ARTL_ART_ragQuery_114] = true;
  }

  public void artTableInitialiser_ART_ragRewrite() {
    artLabelInternalStrings[ARTL_ART_ragRewrite] = "ragRewrite";
    artLabelStrings[ARTL_ART_ragRewrite] = "ragRewrite";
    artKindOfs[ARTL_ART_ragRewrite] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragRewrite_26] = "ragRewrite ::= . ragSymbol ':' ragRules ";
    artLabelStrings[ARTL_ART_ragRewrite_26] = "";
    artlhsL[ARTL_ART_ragRewrite_26] = ARTL_ART_ragRewrite;
    artKindOfs[ARTL_ART_ragRewrite_26] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragRewrite_28] = "ragRewrite ::= ragSymbol . ':' ragRules ";
    artLabelStrings[ARTL_ART_ragRewrite_28] = "";
    artlhsL[ARTL_ART_ragRewrite_28] = ARTL_ART_ragRewrite;
    artSlotInstanceOfs[ARTL_ART_ragRewrite_28] = ARTL_ART_ragSymbol;
    artKindOfs[ARTL_ART_ragRewrite_28] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragRewrite_28] = true;
    artLabelInternalStrings[ARTL_ART_ragRewrite_29] = "ragRewrite ::= ragSymbol ':' ragRules ";
    artLabelStrings[ARTL_ART_ragRewrite_29] = "";
    artlhsL[ARTL_ART_ragRewrite_29] = ARTL_ART_ragRewrite;
    artLabelInternalStrings[ARTL_ART_ragRewrite_30] = "ragRewrite ::= ragSymbol ':' . ragRules ";
    artLabelStrings[ARTL_ART_ragRewrite_30] = "";
    artlhsL[ARTL_ART_ragRewrite_30] = ARTL_ART_ragRewrite;
    artKindOfs[ARTL_ART_ragRewrite_30] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragRewrite_32] = "ragRewrite ::= ragSymbol ':' ragRules .";
    artLabelStrings[ARTL_ART_ragRewrite_32] = "";
    artlhsL[ARTL_ART_ragRewrite_32] = ARTL_ART_ragRewrite;
    artSlotInstanceOfs[ARTL_ART_ragRewrite_32] = ARTL_ART_ragRules;
    artKindOfs[ARTL_ART_ragRewrite_32] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragRewrite_32] = true;
    arteoR_pL[ARTL_ART_ragRewrite_32] = true;
    artPopD[ARTL_ART_ragRewrite_32] = true;
  }

  public void artTableInitialiser_ART_ragRule() {
    artLabelInternalStrings[ARTL_ART_ragRule] = "ragRule";
    artLabelStrings[ARTL_ART_ragRule] = "ragRule";
    artKindOfs[ARTL_ART_ragRule] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragRule_34] = "ragRule ::= . ragPair '->' ragRuleRHS ";
    artLabelStrings[ARTL_ART_ragRule_34] = "";
    artlhsL[ARTL_ART_ragRule_34] = ARTL_ART_ragRule;
    artKindOfs[ARTL_ART_ragRule_34] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragRule_36] = "ragRule ::= ragPair . '->' ragRuleRHS ";
    artLabelStrings[ARTL_ART_ragRule_36] = "";
    artlhsL[ARTL_ART_ragRule_36] = ARTL_ART_ragRule;
    artSlotInstanceOfs[ARTL_ART_ragRule_36] = ARTL_ART_ragPair;
    artKindOfs[ARTL_ART_ragRule_36] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragRule_36] = true;
    artLabelInternalStrings[ARTL_ART_ragRule_37] = "ragRule ::= ragPair '->' ragRuleRHS ";
    artLabelStrings[ARTL_ART_ragRule_37] = "";
    artlhsL[ARTL_ART_ragRule_37] = ARTL_ART_ragRule;
    artLabelInternalStrings[ARTL_ART_ragRule_38] = "ragRule ::= ragPair '->' . ragRuleRHS ";
    artLabelStrings[ARTL_ART_ragRule_38] = "";
    artlhsL[ARTL_ART_ragRule_38] = ARTL_ART_ragRule;
    artKindOfs[ARTL_ART_ragRule_38] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragRule_40] = "ragRule ::= ragPair '->' ragRuleRHS .";
    artLabelStrings[ARTL_ART_ragRule_40] = "";
    artlhsL[ARTL_ART_ragRule_40] = ARTL_ART_ragRule;
    artSlotInstanceOfs[ARTL_ART_ragRule_40] = ARTL_ART_ragRuleRHS;
    artKindOfs[ARTL_ART_ragRule_40] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragRule_40] = true;
    arteoR_pL[ARTL_ART_ragRule_40] = true;
    artPopD[ARTL_ART_ragRule_40] = true;
  }

  public void artTableInitialiser_ART_ragRuleRHS() {
    artLabelInternalStrings[ARTL_ART_ragRuleRHS] = "ragRuleRHS";
    artLabelStrings[ARTL_ART_ragRuleRHS] = "ragRuleRHS";
    artKindOfs[ARTL_ART_ragRuleRHS] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragRuleRHS_42] = "ragRuleRHS ::= . ragEmptyString ";
    artLabelStrings[ARTL_ART_ragRuleRHS_42] = "";
    artlhsL[ARTL_ART_ragRuleRHS_42] = ARTL_ART_ragRuleRHS;
    artKindOfs[ARTL_ART_ragRuleRHS_42] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragRuleRHS_44] = "ragRuleRHS ::= ragEmptyString .";
    artLabelStrings[ARTL_ART_ragRuleRHS_44] = "";
    artlhsL[ARTL_ART_ragRuleRHS_44] = ARTL_ART_ragRuleRHS;
    artSlotInstanceOfs[ARTL_ART_ragRuleRHS_44] = ARTL_ART_ragEmptyString;
    artKindOfs[ARTL_ART_ragRuleRHS_44] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragRuleRHS_44] = true;
    arteoR_pL[ARTL_ART_ragRuleRHS_44] = true;
    artPopD[ARTL_ART_ragRuleRHS_44] = true;
    artLabelInternalStrings[ARTL_ART_ragRuleRHS_46] = "ragRuleRHS ::= . ragEmptySet ";
    artLabelStrings[ARTL_ART_ragRuleRHS_46] = "";
    artlhsL[ARTL_ART_ragRuleRHS_46] = ARTL_ART_ragRuleRHS;
    artKindOfs[ARTL_ART_ragRuleRHS_46] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragRuleRHS_48] = "ragRuleRHS ::= ragEmptySet .";
    artLabelStrings[ARTL_ART_ragRuleRHS_48] = "";
    artlhsL[ARTL_ART_ragRuleRHS_48] = ARTL_ART_ragRuleRHS;
    artSlotInstanceOfs[ARTL_ART_ragRuleRHS_48] = ARTL_ART_ragEmptySet;
    artKindOfs[ARTL_ART_ragRuleRHS_48] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragRuleRHS_48] = true;
    arteoR_pL[ARTL_ART_ragRuleRHS_48] = true;
    artPopD[ARTL_ART_ragRuleRHS_48] = true;
    artLabelInternalStrings[ARTL_ART_ragRuleRHS_50] = "ragRuleRHS ::= . ragCat ";
    artLabelStrings[ARTL_ART_ragRuleRHS_50] = "";
    artlhsL[ARTL_ART_ragRuleRHS_50] = ARTL_ART_ragRuleRHS;
    artKindOfs[ARTL_ART_ragRuleRHS_50] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragRuleRHS_52] = "ragRuleRHS ::= ragCat .";
    artLabelStrings[ARTL_ART_ragRuleRHS_52] = "";
    artlhsL[ARTL_ART_ragRuleRHS_52] = ARTL_ART_ragRuleRHS;
    artSlotInstanceOfs[ARTL_ART_ragRuleRHS_52] = ARTL_ART_ragCat;
    artKindOfs[ARTL_ART_ragRuleRHS_52] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragRuleRHS_52] = true;
    arteoR_pL[ARTL_ART_ragRuleRHS_52] = true;
    artPopD[ARTL_ART_ragRuleRHS_52] = true;
  }

  public void artTableInitialiser_ART_ragRules() {
    artLabelInternalStrings[ARTL_ART_ragRules] = "ragRules";
    artLabelStrings[ARTL_ART_ragRules] = "ragRules";
    artKindOfs[ARTL_ART_ragRules] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragRules_16] = "ragRules ::= . # ";
    artLabelStrings[ARTL_ART_ragRules_16] = "";
    artlhsL[ARTL_ART_ragRules_16] = ARTL_ART_ragRules;
    artKindOfs[ARTL_ART_ragRules_16] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragRules_16] = true;
    artLabelInternalStrings[ARTL_ART_ragRules_18] = "ragRules ::= # .";
    artLabelStrings[ARTL_ART_ragRules_18] = "";
    artlhsL[ARTL_ART_ragRules_18] = ARTL_ART_ragRules;
    artKindOfs[ARTL_ART_ragRules_18] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragRules_18] = true;
    arteoR_pL[ARTL_ART_ragRules_18] = true;
    artPopD[ARTL_ART_ragRules_18] = true;
    artLabelInternalStrings[ARTL_ART_ragRules_20] = "ragRules ::= . ragRule ragRules ";
    artLabelStrings[ARTL_ART_ragRules_20] = "";
    artlhsL[ARTL_ART_ragRules_20] = ARTL_ART_ragRules;
    artKindOfs[ARTL_ART_ragRules_20] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragRules_22] = "ragRules ::= ragRule . ragRules ";
    artLabelStrings[ARTL_ART_ragRules_22] = "";
    artlhsL[ARTL_ART_ragRules_22] = ARTL_ART_ragRules;
    artSlotInstanceOfs[ARTL_ART_ragRules_22] = ARTL_ART_ragRule;
    artKindOfs[ARTL_ART_ragRules_22] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragRules_22] = true;
    artLabelInternalStrings[ARTL_ART_ragRules_24] = "ragRules ::= ragRule ragRules .";
    artLabelStrings[ARTL_ART_ragRules_24] = "";
    artlhsL[ARTL_ART_ragRules_24] = ARTL_ART_ragRules;
    artSlotInstanceOfs[ARTL_ART_ragRules_24] = ARTL_ART_ragRules;
    artKindOfs[ARTL_ART_ragRules_24] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragRules_24] = true;
    arteoR_pL[ARTL_ART_ragRules_24] = true;
    artPopD[ARTL_ART_ragRules_24] = true;
  }

  public void artTableInitialiser_ART_ragStart() {
    artLabelInternalStrings[ARTL_ART_ragStart] = "ragStart";
    artLabelStrings[ARTL_ART_ragStart] = "ragStart";
    artKindOfs[ARTL_ART_ragStart] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragStart_2] = "ragStart ::= . ragName ragRules ";
    artLabelStrings[ARTL_ART_ragStart_2] = "";
    artlhsL[ARTL_ART_ragStart_2] = ARTL_ART_ragStart;
    artKindOfs[ARTL_ART_ragStart_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragStart_4] = "ragStart ::= ragName . ragRules ";
    artLabelStrings[ARTL_ART_ragStart_4] = "";
    artlhsL[ARTL_ART_ragStart_4] = ARTL_ART_ragStart;
    artSlotInstanceOfs[ARTL_ART_ragStart_4] = ARTL_ART_ragName;
    artKindOfs[ARTL_ART_ragStart_4] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragStart_4] = true;
    artLabelInternalStrings[ARTL_ART_ragStart_6] = "ragStart ::= ragName ragRules .";
    artLabelStrings[ARTL_ART_ragStart_6] = "";
    artlhsL[ARTL_ART_ragStart_6] = ARTL_ART_ragStart;
    artSlotInstanceOfs[ARTL_ART_ragStart_6] = ARTL_ART_ragRules;
    artKindOfs[ARTL_ART_ragStart_6] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragStart_6] = true;
    arteoR_pL[ARTL_ART_ragStart_6] = true;
    artPopD[ARTL_ART_ragStart_6] = true;
  }

  public void artTableInitialiser_ART_ragSymbol() {
    artLabelInternalStrings[ARTL_ART_ragSymbol] = "ragSymbol";
    artLabelStrings[ARTL_ART_ragSymbol] = "ragSymbol";
    artKindOfs[ARTL_ART_ragSymbol] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragSymbol_162] = "ragSymbol ::= . &ID ";
    artLabelStrings[ARTL_ART_ragSymbol_162] = "";
    artlhsL[ARTL_ART_ragSymbol_162] = ARTL_ART_ragSymbol;
    artKindOfs[ARTL_ART_ragSymbol_162] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragSymbol_162] = true;
    artLabelInternalStrings[ARTL_ART_ragSymbol_163] = "ragSymbol ::= &ID ";
    artLabelStrings[ARTL_ART_ragSymbol_163] = "";
    artlhsL[ARTL_ART_ragSymbol_163] = ARTL_ART_ragSymbol;
    artPopD[ARTL_ART_ragSymbol_163] = true;
    artLabelInternalStrings[ARTL_ART_ragSymbol_164] = "ragSymbol ::= &ID .";
    artLabelStrings[ARTL_ART_ragSymbol_164] = "";
    artlhsL[ARTL_ART_ragSymbol_164] = ARTL_ART_ragSymbol;
    artKindOfs[ARTL_ART_ragSymbol_164] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragSymbol_164] = true;
    arteoR_pL[ARTL_ART_ragSymbol_164] = true;
    artPopD[ARTL_ART_ragSymbol_164] = true;
    artLabelInternalStrings[ARTL_ART_ragSymbol_166] = "ragSymbol ::= . &STRING_DQ ";
    artLabelStrings[ARTL_ART_ragSymbol_166] = "";
    artlhsL[ARTL_ART_ragSymbol_166] = ARTL_ART_ragSymbol;
    artKindOfs[ARTL_ART_ragSymbol_166] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ragSymbol_166] = true;
    artLabelInternalStrings[ARTL_ART_ragSymbol_167] = "ragSymbol ::= &STRING_DQ ";
    artLabelStrings[ARTL_ART_ragSymbol_167] = "";
    artlhsL[ARTL_ART_ragSymbol_167] = ARTL_ART_ragSymbol;
    artPopD[ARTL_ART_ragSymbol_167] = true;
    artLabelInternalStrings[ARTL_ART_ragSymbol_168] = "ragSymbol ::= &STRING_DQ .";
    artLabelStrings[ARTL_ART_ragSymbol_168] = "";
    artlhsL[ARTL_ART_ragSymbol_168] = ARTL_ART_ragSymbol;
    artKindOfs[ARTL_ART_ragSymbol_168] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragSymbol_168] = true;
    arteoR_pL[ARTL_ART_ragSymbol_168] = true;
    artPopD[ARTL_ART_ragSymbol_168] = true;
  }

  public void artTableInitialiser_ART_ragUnion() {
    artLabelInternalStrings[ARTL_ART_ragUnion] = "ragUnion";
    artLabelStrings[ARTL_ART_ragUnion] = "ragUnion";
    artKindOfs[ARTL_ART_ragUnion] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ragUnion_92] = "ragUnion ::= . ragQuery ";
    artLabelStrings[ARTL_ART_ragUnion_92] = "";
    artlhsL[ARTL_ART_ragUnion_92] = ARTL_ART_ragUnion;
    artKindOfs[ARTL_ART_ragUnion_92] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragUnion_94] = "ragUnion ::= ragQuery .";
    artLabelStrings[ARTL_ART_ragUnion_94] = "";
    artlhsL[ARTL_ART_ragUnion_94] = ARTL_ART_ragUnion;
    artSlotInstanceOfs[ARTL_ART_ragUnion_94] = ARTL_ART_ragQuery;
    artKindOfs[ARTL_ART_ragUnion_94] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragUnion_94] = true;
    arteoR_pL[ARTL_ART_ragUnion_94] = true;
    artPopD[ARTL_ART_ragUnion_94] = true;
    artLabelInternalStrings[ARTL_ART_ragUnion_96] = "ragUnion ::= . ragUnion '\\/' ragQuery ";
    artLabelStrings[ARTL_ART_ragUnion_96] = "";
    artlhsL[ARTL_ART_ragUnion_96] = ARTL_ART_ragUnion;
    artKindOfs[ARTL_ART_ragUnion_96] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragUnion_98] = "ragUnion ::= ragUnion . '\\/' ragQuery ";
    artLabelStrings[ARTL_ART_ragUnion_98] = "";
    artlhsL[ARTL_ART_ragUnion_98] = ARTL_ART_ragUnion;
    artSlotInstanceOfs[ARTL_ART_ragUnion_98] = ARTL_ART_ragUnion;
    artKindOfs[ARTL_ART_ragUnion_98] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_ragUnion_98] = true;
    artLabelInternalStrings[ARTL_ART_ragUnion_99] = "ragUnion ::= ragUnion '\\/' ragQuery ";
    artLabelStrings[ARTL_ART_ragUnion_99] = "";
    artlhsL[ARTL_ART_ragUnion_99] = ARTL_ART_ragUnion;
    artLabelInternalStrings[ARTL_ART_ragUnion_100] = "ragUnion ::= ragUnion '\\/' . ragQuery ";
    artLabelStrings[ARTL_ART_ragUnion_100] = "";
    artlhsL[ARTL_ART_ragUnion_100] = ARTL_ART_ragUnion;
    artKindOfs[ARTL_ART_ragUnion_100] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_ragUnion_102] = "ragUnion ::= ragUnion '\\/' ragQuery .";
    artLabelStrings[ARTL_ART_ragUnion_102] = "";
    artlhsL[ARTL_ART_ragUnion_102] = ARTL_ART_ragUnion;
    artSlotInstanceOfs[ARTL_ART_ragUnion_102] = ARTL_ART_ragQuery;
    artKindOfs[ARTL_ART_ragUnion_102] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ragUnion_102] = true;
    arteoR_pL[ARTL_ART_ragUnion_102] = true;
    artPopD[ARTL_ART_ragUnion_102] = true;
  }

  public void artTableInitialise() {
    artLabelInternalStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelStrings = new String[ARTX_LABEL_EXTENT + 1];
    artLabelInternalStrings[ARTL_EOS] = "ART$";
    artLabelStrings[ARTL_EOS] = " EOS $";
    artLabelInternalStrings[ARTX_DESPATCH] = "ARTX_DESPATCH";
    artLabelStrings[ARTX_DESPATCH] = " DESPATCH";
    artLabelInternalStrings[ARTL_DUMMY] = "ARTL_DUMMY";
    artLabelStrings[ARTL_DUMMY] = " DUMMY";
    artLabelInternalStrings[ARTX_LABEL_EXTENT] = "!!ILLEGAL!!";
    artLabelStrings[ARTX_LABEL_EXTENT] = " ILLEGAL";
    artLabelStrings[ARTL_EPSILON] = "#";
    artLabelInternalStrings[ARTL_EPSILON] = "#";

    artTerminalRequiresWhiteSpace = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalRequiresWhiteSpace, 0, ARTL_EPSILON, false);

    artTerminalCaseInsensitive = new boolean[ARTL_EPSILON];
    artInitialiseBooleanArray(artTerminalCaseInsensitive, 0, ARTL_EPSILON, false);

    artlhsL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artlhsL, 0, ARTX_LABEL_EXTENT);
    artlhsL[ARTX_DESPATCH] = ARTX_DESPATCH;

    artKindOfs = new int[ARTX_LABEL_EXTENT + 1];
    artKindOfs[ARTL_EOS] = ARTK_EOS;
    artKindOfs[ARTL_EPSILON] = ARTK_EPSILON;

    artTerminalsFromNonterminals = new boolean[ARTX_LABEL_EXTENT];

    artNonterminalsDeclaredAsTerminals = new boolean[ARTX_LABEL_EXTENT];

    artLonger = new ARTBitSet[ARTX_LABEL_EXTENT + 1];
    for (int i = 0; i < ARTX_LABEL_EXTENT + 1; i++) artLonger[i] = new ARTBitSet();
    artHigher = new ARTBitSet[ARTX_LABEL_EXTENT + 1];
    for (int i = 0; i < ARTX_LABEL_EXTENT + 1; i++) artHigher[i] = new ARTBitSet();

    artAnnotations = new String[ARTX_LABEL_EXTENT];
    artInitialiseStringArray(artAnnotations, 0, ARTX_LABEL_EXTENT, null);

    artPreSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPreSlots, 0, ARTX_LABEL_EXTENT);

    artPostSlots = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artPostSlots, 0, ARTX_LABEL_EXTENT);

    artInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artSlotInstanceOfs = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artSlotInstanceOfs, 0, ARTX_LABEL_EXTENT);

    artUserNameOfs = new int[ARTX_LABEL_EXTENT + 1];

    artGathers = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artGathers, 0, ARTX_LABEL_EXTENT);

    artFolds = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artFolds, 0, ARTX_LABEL_EXTENT, 0);

    artpL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artpL, 0, ARTX_LABEL_EXTENT);

    artaL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artaL, 0, ARTX_LABEL_EXTENT);

    artcolonL = new int[ARTX_LABEL_EXTENT];
    artInitialiseIntegerArray(artcolonL, 0, ARTX_LABEL_EXTENT);

    arteoOPL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoOPL, 0, ARTX_LABEL_EXTENT, false);

    artfiRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiRL, 0, ARTX_LABEL_EXTENT, false);

    artfiPCL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artfiPCL, 0, ARTX_LABEL_EXTENT, false);

    arteoRL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoRL, 0, ARTX_LABEL_EXTENT, false);

    arteoR_pL = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(arteoR_pL, 0, ARTX_LABEL_EXTENT, false);

    artPopD = new boolean[ARTX_LABEL_EXTENT];
    artInitialiseBooleanArray(artPopD, 0, ARTX_LABEL_EXTENT, false);

    artLabelStrings[ARTTB_ID] = "ID";
    artLabelInternalStrings[ARTTB_ID] = "&ID";
    artKindOfs[ARTTB_ID] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_ID] = true;
    artLabelStrings[ARTTB_STRING_DQ] = "STRING_DQ";
    artLabelInternalStrings[ARTTB_STRING_DQ] = "&STRING_DQ";
    artKindOfs[ARTTB_STRING_DQ] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_STRING_DQ] = true;
    artLabelStrings[ARTTS__SHREIK] = "!";
    artLabelInternalStrings[ARTTS__SHREIK] = "'!'";
    artKindOfs[ARTTS__SHREIK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK] = true;
    artLabelStrings[ARTTS__HASH] = "#";
    artLabelInternalStrings[ARTTS__HASH] = "'#'";
    artKindOfs[ARTTS__HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__HASH] = true;
    artLabelStrings[ARTTS__LPAR] = "(";
    artLabelInternalStrings[ARTTS__LPAR] = "'('";
    artKindOfs[ARTTS__LPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LPAR] = true;
    artLabelStrings[ARTTS__RPAR] = ")";
    artLabelInternalStrings[ARTTS__RPAR] = "')'";
    artKindOfs[ARTTS__RPAR] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RPAR] = true;
    artLabelStrings[ARTTS__COMMA] = ",";
    artLabelInternalStrings[ARTTS__COMMA] = "','";
    artKindOfs[ARTTS__COMMA] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COMMA] = true;
    artLabelStrings[ARTTS__MINUS_GT] = "->";
    artLabelInternalStrings[ARTTS__MINUS_GT] = "'->'";
    artKindOfs[ARTTS__MINUS_GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__MINUS_GT] = true;
    artLabelStrings[ARTTS__COLON] = ":";
    artLabelInternalStrings[ARTTS__COLON] = "':'";
    artKindOfs[ARTTS__COLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__COLON] = true;
    artLabelStrings[ARTTS__SEMICOLON] = ";";
    artLabelInternalStrings[ARTTS__SEMICOLON] = "';'";
    artKindOfs[ARTTS__SEMICOLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SEMICOLON] = true;
    artLabelStrings[ARTTS__LT] = "<";
    artLabelInternalStrings[ARTTS__LT] = "'<'";
    artKindOfs[ARTTS__LT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LT] = true;
    artLabelStrings[ARTTS__GT] = ">";
    artLabelInternalStrings[ARTTS__GT] = "'>'";
    artKindOfs[ARTTS__GT] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__GT] = true;
    artLabelStrings[ARTTS__QUERY] = "?";
    artLabelInternalStrings[ARTTS__QUERY] = "'?'";
    artKindOfs[ARTTS__QUERY] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__QUERY] = true;
    artLabelStrings[ARTTS_Name_COLON] = "Name:";
    artLabelInternalStrings[ARTTS_Name_COLON] = "'Name:'";
    artKindOfs[ARTTS_Name_COLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Name_COLON] = true;
    artLabelStrings[ARTTS__LBRACK] = "[";
    artLabelInternalStrings[ARTTS__LBRACK] = "'['";
    artKindOfs[ARTTS__LBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACK] = true;
    artLabelStrings[ARTTS__BACKSLASH_SLASH] = "\\/";
    artLabelInternalStrings[ARTTS__BACKSLASH_SLASH] = "'\\/'";
    artKindOfs[ARTTS__BACKSLASH_SLASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__BACKSLASH_SLASH] = true;
    artLabelStrings[ARTTS__RBRACK] = "]";
    artLabelInternalStrings[ARTTS__RBRACK] = "']'";
    artKindOfs[ARTTS__RBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACK] = true;
    artLabelStrings[ARTTS__LBRACE_RBRACE] = "{}";
    artLabelInternalStrings[ARTTS__LBRACE_RBRACE] = "'{}'";
    artKindOfs[ARTTS__LBRACE_RBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACE_RBRACE] = true;
    artTableInitialiser_ART_ragCat();
    artTableInitialiser_ART_ragElement();
    artTableInitialiser_ART_ragEmptySet();
    artTableInitialiser_ART_ragEmptyString();
    artTableInitialiser_ART_ragInverse();
    artTableInitialiser_ART_ragMap();
    artTableInitialiser_ART_ragName();
    artTableInitialiser_ART_ragPair();
    artTableInitialiser_ART_ragQuery();
    artTableInitialiser_ART_ragRewrite();
    artTableInitialiser_ART_ragRule();
    artTableInitialiser_ART_ragRuleRHS();
    artTableInitialiser_ART_ragRules();
    artTableInitialiser_ART_ragStart();
    artTableInitialiser_ART_ragSymbol();
    artTableInitialiser_ART_ragUnion();
  }

  public ARTGeneratedParser(ARTLexerBase artLexerBase) {
    this(null, artLexerBase);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerBase artLexerBase) {
    super(artGrammar, artLexerBase);
    artFirstTerminalLabel = ARTTS__SHREIK;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = ARTX_EPSILON + 1;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_ragStart;
    artBuildOptions = "ARTOptionBlock [verbosityLevel=0, statistics=false, trace=false, inputFilenames=[], phaseModule=true, phaseLex=true, phasePreChoose=true, phaseParse=true, phasePostChoose=true, phaseDerivationSelect=true, phaseGIFT=true, phaseAG=true, phaseTR=true, phaseSOS=true, showTWE=false, showBSR=false, showSPPFFull=false, showSPPFCore=false, showDT=false, showGIFT=false, showAG=false, showTR=false, showSOS=false, ebnfClosureLeft=false, ebnfClosureRight=false, ebnfMultiplyOut=false, ebnfLeftFactor=false, ebnfBracketToNonterminal=false, lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDFA=false, lexCFRecognise=false, lexCFParse=true, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, postLongestWithin=false, postLongestAcross=false, postPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, targetLanguageMode=Java, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, mGLL=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;
  public void ARTRD_ragCat(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*ragCat ::= ragPair .*/
      case ARTL_ART_ragCat_56: 
                ARTRD_ragCat(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
        ARTRD_ragPair(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
                break;
      /*ragCat ::= ragPair ragCat .*/
      case ARTL_ART_ragCat_62: 
                artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
        ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
        ARTRD_ragCat(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
                break;
        default:
          throw new ARTException("ARTRD_ragCat: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragElement(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragElement ::= ragSymbol .*/
    case ARTL_ART_ragElement_128: 
            ARTRD_ragElement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragSymbol(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragElement ::= ragMap .*/
    case ARTL_ART_ragElement_132: 
            ARTRD_ragElement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragMap(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragElement ::= '(' ragPair . ')' */
    case ARTL_ART_ragElement_138: 
                  artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragPair(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragElement ::= '(' ragPair ')' .*/
    case ARTL_ART_ragElement_140: 
            ARTRD_ragElement(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_ragElement: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragEmptySet(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragEmptySet ::= '{}' .*/
    case ARTL_ART_ragEmptySet_160: 
            ARTRD_ragEmptySet(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_ragEmptySet: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragEmptyString(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragEmptyString ::= '#' .*/
    case ARTL_ART_ragEmptyString_156: 
            ARTRD_ragEmptyString(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_ragEmptyString: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragInverse(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragInverse ::= ragElement .*/
    case ARTL_ART_ragInverse_118: 
            ARTRD_ragInverse(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragElement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragInverse ::= '!' ragPair .*/
    case ARTL_ART_ragInverse_124: 
                        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragPair(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ragInverse: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragMap(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragMap ::= '[' ragElement . ',' ragElement ']' */
    case ARTL_ART_ragMap_146: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragElement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragMap ::= '[' ragElement ',' . ragElement ']' */
    case ARTL_ART_ragMap_148: 
      ARTRD_ragMap(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*ragMap ::= '[' ragElement ',' ragElement . ']' */
    case ARTL_ART_ragMap_150: 
      ARTRD_ragMap(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragElement(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragMap ::= '[' ragElement ',' ragElement ']' .*/
    case ARTL_ART_ragMap_152: 
            ARTRD_ragMap(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_ragMap: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragName(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragName ::= 'Name:' &STRING_DQ . ';' */
    case ARTL_ART_ragName_12: 
                        if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*ragName ::= 'Name:' &STRING_DQ ';' .*/
    case ARTL_ART_ragName_14: 
            ARTRD_ragName(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_ragName: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragPair(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragPair ::= ragUnion .*/
    case ARTL_ART_ragPair_66: 
            ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragUnion(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragPair ::= '<' ragUnion . ',' ragPair '>' */
    case ARTL_ART_ragPair_72: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragUnion(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragPair ::= '<' ragUnion ',' . ragPair '>' */
    case ARTL_ART_ragPair_74: 
      ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*ragPair ::= '<' ragUnion ',' ragPair . '>' */
    case ARTL_ART_ragPair_76: 
      ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragPair(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragPair ::= '<' ragUnion ',' ragPair '>' .*/
    case ARTL_ART_ragPair_78: 
            ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*ragPair ::= '<' ragUnion . ',' ragEmptyString '>' */
    case ARTL_ART_ragPair_84: 
                  artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragUnion(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragPair ::= '<' ragUnion ',' . ragEmptyString '>' */
    case ARTL_ART_ragPair_86: 
      ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*ragPair ::= '<' ragUnion ',' ragEmptyString . '>' */
    case ARTL_ART_ragPair_88: 
      ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragEmptyString(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragPair ::= '<' ragUnion ',' ragEmptyString '>' .*/
    case ARTL_ART_ragPair_90: 
            ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
        default:
          throw new ARTException("ARTRD_ragPair: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragQuery(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragQuery ::= ragInverse .*/
    case ARTL_ART_ragQuery_106: 
            ARTRD_ragQuery(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragInverse(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragQuery ::= ragInverse '?' . ragQuery */
    case ARTL_ART_ragQuery_112: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_ragInverse(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ragQuery ::= ragInverse '?' ragQuery .*/
    case ARTL_ART_ragQuery_114: 
            ARTRD_ragQuery(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragQuery(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ragQuery: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragRewrite(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragRewrite ::= ragSymbol ':' . ragRules */
    case ARTL_ART_ragRewrite_30: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_ragSymbol(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ragRewrite ::= ragSymbol ':' ragRules .*/
    case ARTL_ART_ragRewrite_32: 
            ARTRD_ragRewrite(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_ragRules(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ragRewrite: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragRule(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragRule ::= ragPair '->' . ragRuleRHS */
    case ARTL_ART_ragRule_38: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_ragPair(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ragRule ::= ragPair '->' ragRuleRHS .*/
    case ARTL_ART_ragRule_40: 
            ARTRD_ragRule(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = false; artNewParent = artParent;
      ARTRD_ragRuleRHS(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ragRule: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragRuleRHS(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragRuleRHS ::= ragEmptyString .*/
    case ARTL_ART_ragRuleRHS_44: 
            ARTRD_ragRuleRHS(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragEmptyString(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragRuleRHS ::= ragEmptySet .*/
    case ARTL_ART_ragRuleRHS_48: 
            ARTRD_ragRuleRHS(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragEmptySet(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragRuleRHS ::= ragCat .*/
    case ARTL_ART_ragRuleRHS_52: 
            ARTRD_ragRuleRHS(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragCat(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ragRuleRHS: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragRules(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragRules ::= # .*/
    case ARTL_ART_ragRules_18: 
            ARTRD_ragRules(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
                  break;
    /*ragRules ::= ragRule ragRules .*/
    case ARTL_ART_ragRules_24: 
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_ragRule(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = false; artNewParent = artParent;
      ARTRD_ragRules(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ragRules: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragStart(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragStart ::= ragName ragRules .*/
    case ARTL_ART_ragStart_6: 
            artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_ragName(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragRules(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ragStart: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragSymbol(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragSymbol ::= &ID .*/
    case ARTL_ART_ragSymbol_164: 
            ARTRD_ragSymbol(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*ragSymbol ::= &STRING_DQ .*/
    case ARTL_ART_ragSymbol_168: 
            ARTRD_ragSymbol(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
        default:
          throw new ARTException("ARTRD_ragSymbol: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ragUnion(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ragUnion ::= ragQuery .*/
    case ARTL_ART_ragUnion_94: 
            ARTRD_ragUnion(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = artWriteable; artNewParent = artParent;      if (artWriteable) artParent.setPayload(new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragQuery(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
    /*ragUnion ::= ragUnion '\/' . ragQuery */
    case ARTL_ART_ragUnion_100: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
      ARTRD_ragUnion(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable);
                        break;
    /*ragUnion ::= ragUnion '\/' ragQuery .*/
    case ARTL_ART_ragUnion_102: 
            ARTRD_ragUnion(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      ARTRD_ragQuery(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable);
            break;
        default:
          throw new ARTException("ARTRD_ragUnion: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_ragCat: ARTRD_ragCat(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragElement: ARTRD_ragElement(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragEmptySet: ARTRD_ragEmptySet(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragEmptyString: ARTRD_ragEmptyString(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragInverse: ARTRD_ragInverse(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragMap: ARTRD_ragMap(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragName: ARTRD_ragName(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragPair: ARTRD_ragPair(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragQuery: ARTRD_ragQuery(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragRewrite: ARTRD_ragRewrite(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragRule: ARTRD_ragRule(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragRuleRHS: ARTRD_ragRuleRHS(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragRules: ARTRD_ragRules(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragStart: ARTRD_ragStart(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragSymbol: ARTRD_ragSymbol(artElement.element, artParent, artWriteable); break;
    case ARTL_ART_ragUnion: ARTRD_ragUnion(artElement.element, artParent, artWriteable); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artAnnotations, artLexer.artInputString);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), null));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), null, artNewParent, artNewWriteable);
  artAttributeEvaluateCompleteTime = artReadClock();
  return artRDT;
}
};
