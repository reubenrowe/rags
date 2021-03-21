package rnsr.rag.art;

import java.io.FileNotFoundException;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.*;
import uk.ac.rhul.cs.csle.art.v3.lex.*;
import uk.ac.rhul.cs.csle.art.v3.manager.*;
import uk.ac.rhul.cs.csle.art.v3.manager.grammar.*;
import uk.ac.rhul.cs.csle.art.v3.manager.mode.*;
import uk.ac.rhul.cs.csle.art.util.*;
import uk.ac.rhul.cs.csle.art.util.text.*;
import uk.ac.rhul.cs.csle.art.v3.value.*;
/*******************************************************************************
*
* ARTGeneratedParser.java
*
*******************************************************************************/

    import java.io.BufferedWriter;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.util.HashMap;
    import java.util.ArrayList;
    import java.util.Set;

public class ARTGeneratedParser extends ARTGLLParserHashPool {
  private String artInputString; // This is used in the MGLL generated parser instead of artlexer.artinputString
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
  private static boolean[] ARTSet33;
  private static boolean[] ARTSet34;
  private static boolean[] ARTSet35;
  private static boolean[] ARTSet36;
  private static boolean[] ARTSet37;
  private static boolean[] ARTSet38;
  private static boolean[] ARTSet39;
  private static boolean[] ARTSet40;
  private static boolean[] ARTSet41;
  private static boolean[] ARTSet42;
  private static boolean[] ARTSet43;
  private static boolean[] ARTSet44;
  private static boolean[] ARTSet45;
  private static boolean[] ARTSet46;
  private static boolean[] ARTSet47;
  private static boolean[] ARTSet48;
  private static boolean[] ARTSet49;
  private static boolean[] ARTSet50;
  private static boolean[] ARTSet51;
  private static boolean[] ARTSet52;
  private static boolean[] ARTSet53;
  private static boolean[] ARTSet54;
  private static boolean[] ARTSet55;
  private static boolean[] ARTSet56;
  private static boolean[] ARTSet57;
  private static boolean[] ARTSet58;

  /* Start of artLabel enumeration */
  public static final int ARTX_EOS = 0;
  public static final int ARTTB_ID = 1;
  public static final int ARTTB_SIMPLE_WHITESPACE = 2;
  public static final int ARTTB_STRING_SQ = 3;
  public static final int ARTTS__SHREIK_EQUAL = 4;
  public static final int ARTTS__HASH = 5;
  public static final int ARTTS__AMPERSAND = 6;
  public static final int ARTTS__AMPERSANDANSWER = 7;
  public static final int ARTTS__AMPERSANDLETTER = 8;
  public static final int ARTTS__AMPERSANDWORD = 9;
  public static final int ARTTS__LPAR = 10;
  public static final int ARTTS__RPAR = 11;
  public static final int ARTTS__COMMA = 12;
  public static final int ARTTS__MINUS_GT = 13;
  public static final int ARTTS__COLON = 14;
  public static final int ARTTS__SEMICOLON = 15;
  public static final int ARTTS__LT = 16;
  public static final int ARTTS__GT = 17;
  public static final int ARTTS__QUERY = 18;
  public static final int ARTTS_Name_COLON = 19;
  public static final int ARTTS_Start_COLON = 20;
  public static final int ARTTS__LBRACK = 21;
  public static final int ARTTS__RBRACK = 22;
  public static final int ARTTS__LBRACE_RBRACE = 23;
  public static final int ARTX_EPSILON = 24;
  public static final int ARTL_ART_AV = 25;
  public static final int ARTL_ART_AVarglist = 26;
  public static final int ARTL_ART_AVsig = 27;
  public static final int ARTL_ART_ID = 28;
  public static final int ARTL_ART_QV = 29;
  public static final int ARTL_ART_QVlist = 30;
  public static final int ARTL_ART_QVsig = 31;
  public static final int ARTL_ART_RAG = 32;
  public static final int ARTL_ART_RAGIDList = 33;
  public static final int ARTL_ART_RAGRangeCond = 34;
  public static final int ARTL_ART_RAGRangeDef = 35;
  public static final int ARTL_ART_RAGRangeExpr = 36;
  public static final int ARTL_ART_RAGRangeSet = 37;
  public static final int ARTL_ART_RAGRanges = 38;
  public static final int ARTL_ART_RAGname = 39;
  public static final int ARTL_ART_RAGrhs = 40;
  public static final int ARTL_ART_RAGrule = 41;
  public static final int ARTL_ART_RAGstartsymbol = 42;
  public static final int ARTL_ART_STRING_SQ = 43;
  public static final int ARTL_ART_Start = 44;
  public static final int ARTL_ART_AV_83 = 45;
  public static final int ARTL_ART_AV_84 = 46;
  public static final int ARTL_ART_AV_87 = 47;
  public static final int ARTL_ART_AV_88 = 48;
  public static final int ARTL_ART_AV_91 = 49;
  public static final int ARTL_ART_AV_92 = 50;
  public static final int ARTL_ART_AV_95 = 51;
  public static final int ARTL_ART_AV_96 = 52;
  public static final int ARTL_ART_AV_97 = 53;
  public static final int ARTL_ART_AV_98 = 54;
  public static final int ARTL_ART_AVarglist_101 = 55;
  public static final int ARTL_ART_AVarglist_102 = 56;
  public static final int ARTL_ART_AVarglist_105 = 57;
  public static final int ARTL_ART_AVarglist_106 = 58;
  public static final int ARTL_ART_AVarglist_109 = 59;
  public static final int ARTL_ART_AVarglist_110 = 60;
  public static final int ARTL_ART_AVarglist_113 = 61;
  public static final int ARTL_ART_AVarglist_114 = 62;
  public static final int ARTL_ART_AVarglist_115 = 63;
  public static final int ARTL_ART_AVarglist_116 = 64;
  public static final int ARTL_ART_AVarglist_117 = 65;
  public static final int ARTL_ART_AVarglist_118 = 66;
  public static final int ARTL_ART_AVsig_43 = 67;
  public static final int ARTL_ART_AVsig_44 = 68;
  public static final int ARTL_ART_AVsig_45 = 69;
  public static final int ARTL_ART_AVsig_46 = 70;
  public static final int ARTL_ART_AVsig_49 = 71;
  public static final int ARTL_ART_AVsig_50 = 72;
  public static final int ARTL_ART_AVsig_53 = 73;
  public static final int ARTL_ART_AVsig_54 = 74;
  public static final int ARTL_ART_AVsig_55 = 75;
  public static final int ARTL_ART_AVsig_56 = 76;
  public static final int ARTL_ART_AVsig_59 = 77;
  public static final int ARTL_ART_AVsig_60 = 78;
  public static final int ARTL_ART_AVsig_61 = 79;
  public static final int ARTL_ART_AVsig_62 = 80;
  public static final int ARTL_ART_AVsig_63 = 81;
  public static final int ARTL_ART_AVsig_64 = 82;
  public static final int ARTL_ART_AVsig_65 = 83;
  public static final int ARTL_ART_AVsig_66 = 84;
  public static final int ARTL_ART_AVsig_67 = 85;
  public static final int ARTL_ART_AVsig_68 = 86;
  public static final int ARTL_ART_AVsig_71 = 87;
  public static final int ARTL_ART_AVsig_72 = 88;
  public static final int ARTL_ART_AVsig_73 = 89;
  public static final int ARTL_ART_AVsig_74 = 90;
  public static final int ARTL_ART_AVsig_77 = 91;
  public static final int ARTL_ART_AVsig_78 = 92;
  public static final int ARTL_ART_AVsig_79 = 93;
  public static final int ARTL_ART_AVsig_80 = 94;
  public static final int ARTL_ART_ID_293 = 95;
  public static final int ARTL_ART_ID_294 = 96;
  public static final int ARTL_ART_ID_295 = 97;
  public static final int ARTL_ART_ID_296 = 98;
  public static final int ARTL_ART_QV_175 = 99;
  public static final int ARTL_ART_QV_176 = 100;
  public static final int ARTL_ART_QV_179 = 101;
  public static final int ARTL_ART_QV_180 = 102;
  public static final int ARTL_ART_QV_183 = 103;
  public static final int ARTL_ART_QV_184 = 104;
  public static final int ARTL_ART_QV_187 = 105;
  public static final int ARTL_ART_QV_188 = 106;
  public static final int ARTL_ART_QV_189 = 107;
  public static final int ARTL_ART_QV_190 = 108;
  public static final int ARTL_ART_QVlist_193 = 109;
  public static final int ARTL_ART_QVlist_194 = 110;
  public static final int ARTL_ART_QVlist_197 = 111;
  public static final int ARTL_ART_QVlist_198 = 112;
  public static final int ARTL_ART_QVlist_201 = 113;
  public static final int ARTL_ART_QVlist_202 = 114;
  public static final int ARTL_ART_QVlist_205 = 115;
  public static final int ARTL_ART_QVlist_206 = 116;
  public static final int ARTL_ART_QVlist_207 = 117;
  public static final int ARTL_ART_QVlist_208 = 118;
  public static final int ARTL_ART_QVlist_209 = 119;
  public static final int ARTL_ART_QVlist_210 = 120;
  public static final int ARTL_ART_QVsig_121 = 121;
  public static final int ARTL_ART_QVsig_122 = 122;
  public static final int ARTL_ART_QVsig_123 = 123;
  public static final int ARTL_ART_QVsig_124 = 124;
  public static final int ARTL_ART_QVsig_127 = 125;
  public static final int ARTL_ART_QVsig_128 = 126;
  public static final int ARTL_ART_QVsig_131 = 127;
  public static final int ARTL_ART_QVsig_132 = 128;
  public static final int ARTL_ART_QVsig_133 = 129;
  public static final int ARTL_ART_QVsig_134 = 130;
  public static final int ARTL_ART_QVsig_137 = 131;
  public static final int ARTL_ART_QVsig_138 = 132;
  public static final int ARTL_ART_QVsig_139 = 133;
  public static final int ARTL_ART_QVsig_140 = 134;
  public static final int ARTL_ART_QVsig_141 = 135;
  public static final int ARTL_ART_QVsig_142 = 136;
  public static final int ARTL_ART_QVsig_143 = 137;
  public static final int ARTL_ART_QVsig_144 = 138;
  public static final int ARTL_ART_QVsig_145 = 139;
  public static final int ARTL_ART_QVsig_146 = 140;
  public static final int ARTL_ART_QVsig_149 = 141;
  public static final int ARTL_ART_QVsig_150 = 142;
  public static final int ARTL_ART_QVsig_151 = 143;
  public static final int ARTL_ART_QVsig_152 = 144;
  public static final int ARTL_ART_QVsig_155 = 145;
  public static final int ARTL_ART_QVsig_156 = 146;
  public static final int ARTL_ART_QVsig_157 = 147;
  public static final int ARTL_ART_QVsig_158 = 148;
  public static final int ARTL_ART_QVsig_161 = 149;
  public static final int ARTL_ART_QVsig_162 = 150;
  public static final int ARTL_ART_QVsig_163 = 151;
  public static final int ARTL_ART_QVsig_164 = 152;
  public static final int ARTL_ART_QVsig_165 = 153;
  public static final int ARTL_ART_QVsig_166 = 154;
  public static final int ARTL_ART_QVsig_167 = 155;
  public static final int ARTL_ART_QVsig_168 = 156;
  public static final int ARTL_ART_QVsig_169 = 157;
  public static final int ARTL_ART_QVsig_170 = 158;
  public static final int ARTL_ART_QVsig_171 = 159;
  public static final int ARTL_ART_QVsig_172 = 160;
  public static final int ARTL_ART_RAG_29 = 161;
  public static final int ARTL_ART_RAG_30 = 162;
  public static final int ARTL_ART_RAG_31 = 163;
  public static final int ARTL_ART_RAG_32 = 164;
  public static final int ARTL_ART_RAG_35 = 165;
  public static final int ARTL_ART_RAG_36 = 166;
  public static final int ARTL_ART_RAG_37 = 167;
  public static final int ARTL_ART_RAG_38 = 168;
  public static final int ARTL_ART_RAG_39 = 169;
  public static final int ARTL_ART_RAG_40 = 170;
  public static final int ARTL_ART_RAGIDList_351 = 171;
  public static final int ARTL_ART_RAGIDList_352 = 172;
  public static final int ARTL_ART_RAGIDList_355 = 173;
  public static final int ARTL_ART_RAGIDList_356 = 174;
  public static final int ARTL_ART_RAGIDList_357 = 175;
  public static final int ARTL_ART_RAGIDList_358 = 176;
  public static final int ARTL_ART_RAGIDList_361 = 177;
  public static final int ARTL_ART_RAGIDList_362 = 178;
  public static final int ARTL_ART_RAGIDList_365 = 179;
  public static final int ARTL_ART_RAGIDList_366 = 180;
  public static final int ARTL_ART_RAGIDList_367 = 181;
  public static final int ARTL_ART_RAGIDList_368 = 182;
  public static final int ARTL_ART_RAGIDList_369 = 183;
  public static final int ARTL_ART_RAGIDList_370 = 184;
  public static final int ARTL_ART_RAGIDList_371 = 185;
  public static final int ARTL_ART_RAGIDList_372 = 186;
  public static final int ARTL_ART_RAGRangeCond_375 = 187;
  public static final int ARTL_ART_RAGRangeCond_376 = 188;
  public static final int ARTL_ART_RAGRangeCond_379 = 189;
  public static final int ARTL_ART_RAGRangeCond_380 = 190;
  public static final int ARTL_ART_RAGRangeCond_381 = 191;
  public static final int ARTL_ART_RAGRangeCond_382 = 192;
  public static final int ARTL_ART_RAGRangeCond_383 = 193;
  public static final int ARTL_ART_RAGRangeCond_384 = 194;
  public static final int ARTL_ART_RAGRangeCond_385 = 195;
  public static final int ARTL_ART_RAGRangeCond_386 = 196;
  public static final int ARTL_ART_RAGRangeCond_387 = 197;
  public static final int ARTL_ART_RAGRangeCond_388 = 198;
  public static final int ARTL_ART_RAGRangeDef_339 = 199;
  public static final int ARTL_ART_RAGRangeDef_340 = 200;
  public static final int ARTL_ART_RAGRangeDef_343 = 201;
  public static final int ARTL_ART_RAGRangeDef_344 = 202;
  public static final int ARTL_ART_RAGRangeDef_345 = 203;
  public static final int ARTL_ART_RAGRangeDef_346 = 204;
  public static final int ARTL_ART_RAGRangeDef_347 = 205;
  public static final int ARTL_ART_RAGRangeDef_348 = 206;
  public static final int ARTL_ART_RAGRangeExpr_323 = 207;
  public static final int ARTL_ART_RAGRangeExpr_324 = 208;
  public static final int ARTL_ART_RAGRangeExpr_327 = 209;
  public static final int ARTL_ART_RAGRangeExpr_328 = 210;
  public static final int ARTL_ART_RAGRangeExpr_331 = 211;
  public static final int ARTL_ART_RAGRangeExpr_332 = 212;
  public static final int ARTL_ART_RAGRangeExpr_335 = 213;
  public static final int ARTL_ART_RAGRangeExpr_336 = 214;
  public static final int ARTL_ART_RAGRangeSet_391 = 215;
  public static final int ARTL_ART_RAGRangeSet_392 = 216;
  public static final int ARTL_ART_RAGRangeSet_393 = 217;
  public static final int ARTL_ART_RAGRangeSet_394 = 218;
  public static final int ARTL_ART_RAGRangeSet_397 = 219;
  public static final int ARTL_ART_RAGRangeSet_398 = 220;
  public static final int ARTL_ART_RAGRangeSet_399 = 221;
  public static final int ARTL_ART_RAGRangeSet_400 = 222;
  public static final int ARTL_ART_RAGRangeSet_403 = 223;
  public static final int ARTL_ART_RAGRangeSet_404 = 224;
  public static final int ARTL_ART_RAGRangeSet_405 = 225;
  public static final int ARTL_ART_RAGRangeSet_406 = 226;
  public static final int ARTL_ART_RAGRanges_305 = 227;
  public static final int ARTL_ART_RAGRanges_306 = 228;
  public static final int ARTL_ART_RAGRanges_309 = 229;
  public static final int ARTL_ART_RAGRanges_310 = 230;
  public static final int ARTL_ART_RAGRanges_311 = 231;
  public static final int ARTL_ART_RAGRanges_312 = 232;
  public static final int ARTL_ART_RAGRanges_315 = 233;
  public static final int ARTL_ART_RAGRanges_316 = 234;
  public static final int ARTL_ART_RAGRanges_317 = 235;
  public static final int ARTL_ART_RAGRanges_318 = 236;
  public static final int ARTL_ART_RAGRanges_319 = 237;
  public static final int ARTL_ART_RAGRanges_320 = 238;
  public static final int ARTL_ART_RAGname_13 = 239;
  public static final int ARTL_ART_RAGname_14 = 240;
  public static final int ARTL_ART_RAGname_15 = 241;
  public static final int ARTL_ART_RAGname_16 = 242;
  public static final int ARTL_ART_RAGname_17 = 243;
  public static final int ARTL_ART_RAGname_18 = 244;
  public static final int ARTL_ART_RAGrhs_235 = 245;
  public static final int ARTL_ART_RAGrhs_236 = 246;
  public static final int ARTL_ART_RAGrhs_237 = 247;
  public static final int ARTL_ART_RAGrhs_238 = 248;
  public static final int ARTL_ART_RAGrhs_241 = 249;
  public static final int ARTL_ART_RAGrhs_242 = 250;
  public static final int ARTL_ART_RAGrhs_245 = 251;
  public static final int ARTL_ART_RAGrhs_246 = 252;
  public static final int ARTL_ART_RAGrhs_247 = 253;
  public static final int ARTL_ART_RAGrhs_248 = 254;
  public static final int ARTL_ART_RAGrhs_249 = 255;
  public static final int ARTL_ART_RAGrhs_250 = 256;
  public static final int ARTL_ART_RAGrhs_251 = 257;
  public static final int ARTL_ART_RAGrhs_252 = 258;
  public static final int ARTL_ART_RAGrhs_253 = 259;
  public static final int ARTL_ART_RAGrhs_254 = 260;
  public static final int ARTL_ART_RAGrhs_255 = 261;
  public static final int ARTL_ART_RAGrhs_256 = 262;
  public static final int ARTL_ART_RAGrhs_259 = 263;
  public static final int ARTL_ART_RAGrhs_260 = 264;
  public static final int ARTL_ART_RAGrhs_261 = 265;
  public static final int ARTL_ART_RAGrhs_262 = 266;
  public static final int ARTL_ART_RAGrhs_263 = 267;
  public static final int ARTL_ART_RAGrhs_264 = 268;
  public static final int ARTL_ART_RAGrhs_267 = 269;
  public static final int ARTL_ART_RAGrhs_268 = 270;
  public static final int ARTL_ART_RAGrhs_271 = 271;
  public static final int ARTL_ART_RAGrhs_272 = 272;
  public static final int ARTL_ART_RAGrhs_273 = 273;
  public static final int ARTL_ART_RAGrhs_274 = 274;
  public static final int ARTL_ART_RAGrhs_275 = 275;
  public static final int ARTL_ART_RAGrhs_276 = 276;
  public static final int ARTL_ART_RAGrhs_277 = 277;
  public static final int ARTL_ART_RAGrhs_278 = 278;
  public static final int ARTL_ART_RAGrhs_279 = 279;
  public static final int ARTL_ART_RAGrhs_280 = 280;
  public static final int ARTL_ART_RAGrhs_281 = 281;
  public static final int ARTL_ART_RAGrhs_282 = 282;
  public static final int ARTL_ART_RAGrhs_283 = 283;
  public static final int ARTL_ART_RAGrhs_284 = 284;
  public static final int ARTL_ART_RAGrhs_287 = 285;
  public static final int ARTL_ART_RAGrhs_288 = 286;
  public static final int ARTL_ART_RAGrhs_289 = 287;
  public static final int ARTL_ART_RAGrhs_290 = 288;
  public static final int ARTL_ART_RAGrule_213 = 289;
  public static final int ARTL_ART_RAGrule_214 = 290;
  public static final int ARTL_ART_RAGrule_217 = 291;
  public static final int ARTL_ART_RAGrule_218 = 292;
  public static final int ARTL_ART_RAGrule_219 = 293;
  public static final int ARTL_ART_RAGrule_220 = 294;
  public static final int ARTL_ART_RAGrule_221 = 295;
  public static final int ARTL_ART_RAGrule_222 = 296;
  public static final int ARTL_ART_RAGrule_223 = 297;
  public static final int ARTL_ART_RAGrule_224 = 298;
  public static final int ARTL_ART_RAGrule_225 = 299;
  public static final int ARTL_ART_RAGrule_226 = 300;
  public static final int ARTL_ART_RAGrule_227 = 301;
  public static final int ARTL_ART_RAGrule_228 = 302;
  public static final int ARTL_ART_RAGrule_229 = 303;
  public static final int ARTL_ART_RAGrule_230 = 304;
  public static final int ARTL_ART_RAGrule_231 = 305;
  public static final int ARTL_ART_RAGrule_232 = 306;
  public static final int ARTL_ART_RAGstartsymbol_21 = 307;
  public static final int ARTL_ART_RAGstartsymbol_22 = 308;
  public static final int ARTL_ART_RAGstartsymbol_23 = 309;
  public static final int ARTL_ART_RAGstartsymbol_24 = 310;
  public static final int ARTL_ART_RAGstartsymbol_25 = 311;
  public static final int ARTL_ART_RAGstartsymbol_26 = 312;
  public static final int ARTL_ART_STRING_SQ_299 = 313;
  public static final int ARTL_ART_STRING_SQ_300 = 314;
  public static final int ARTL_ART_STRING_SQ_301 = 315;
  public static final int ARTL_ART_STRING_SQ_302 = 316;
  public static final int ARTL_ART_Start_1 = 317;
  public static final int ARTL_ART_Start_2 = 318;
  public static final int ARTL_ART_Start_5 = 319;
  public static final int ARTL_ART_Start_6 = 320;
  public static final int ARTL_ART_Start_7 = 321;
  public static final int ARTL_ART_Start_8 = 322;
  public static final int ARTL_ART_Start_9 = 323;
  public static final int ARTL_ART_Start_10 = 324;
  public static final int ARTX_DESPATCH = 325;
  public static final int ARTX_DUMMY = 326;
  public static final int ARTX_LABEL_EXTENT = 327;
  /* End of artLabel enumeration */

  /* Start of artName enumeration */
  public static final int ARTNAME_NONE = 0;
  public static final int ARTNAME_EXTENT = 1;
  /* End of artName enumeration */
  public void ARTPF_ART_AV() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal AV production descriptor loads*/
      case ARTL_ART_AV: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AV_84, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AV_92, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal AV: match production*/
      case ARTL_ART_AV_84: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AV_88, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AVsig; return; }
      case ARTL_ART_AV_88: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal AV: match production*/
      case ARTL_ART_AV_92: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AV_96, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AVsig; return; }
      case ARTL_ART_AV_96: 
        /* Nonterminal template end */
        if (!ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AV_98, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AV; return; }
      case ARTL_ART_AV_98: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet3[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_AVarglist() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal AVarglist production descriptor loads*/
      case ARTL_ART_AVarglist: 
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AVarglist_102, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet5[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AVarglist_110, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal AVarglist: match production*/
      case ARTL_ART_AVarglist_102: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AVarglist_106, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AV; return; }
      case ARTL_ART_AVarglist_106: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal AVarglist: match production*/
      case ARTL_ART_AVarglist_110: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AVarglist_114, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AV; return; }
      case ARTL_ART_AVarglist_114: 
        /* Nonterminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_AVarglist_116, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AVarglist_118, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AVarglist; return; }
      case ARTL_ART_AVarglist_118: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_AVsig() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal AVsig production descriptor loads*/
      case ARTL_ART_AVsig: 
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AVsig_44, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AVsig_50, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AVsig_60, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AVsig_72, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_AVsig_78, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal AVsig: match production*/
      case ARTL_ART_AVsig_44: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AVsig_46, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_AVsig_46: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal AVsig: match production*/
      case ARTL_ART_AVsig_50: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_AVsig_54, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AVsig_56, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_AVsig_56: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal AVsig: match production*/
      case ARTL_ART_AVsig_60: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AVsig_62, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_AVsig_62: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_AVsig_64, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet8[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AVsig_66, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AVarglist; return; }
      case ARTL_ART_AVsig_66: 
        /* Nonterminal template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_AVsig_68, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal AVsig: match production*/
      case ARTL_ART_AVsig_72: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_AVsig_74, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_SQ; return; }
      case ARTL_ART_AVsig_74: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal AVsig: match production*/
      case ARTL_ART_AVsig_78: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_AVsig_80, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet10[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_ID() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal ID production descriptor loads*/
      case ARTL_ART_ID: 
        if (ARTSet16[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_ID_294, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal ID: match production*/
      case ARTL_ART_ID_294: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_ID, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_ID_296, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet17[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_QV() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal QV production descriptor loads*/
      case ARTL_ART_QV: 
        if (ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QV_176, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet18[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QV_184, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal QV: match production*/
      case ARTL_ART_QV_176: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QV_180, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QVsig; return; }
      case ARTL_ART_QV_180: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal QV: match production*/
      case ARTL_ART_QV_184: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QV_188, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QVsig; return; }
      case ARTL_ART_QV_188: 
        /* Nonterminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QV_190, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QV; return; }
      case ARTL_ART_QV_190: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet19[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_QVlist() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal QVlist production descriptor loads*/
      case ARTL_ART_QVlist: 
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QVlist_194, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QVlist_202, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal QVlist: match production*/
      case ARTL_ART_QVlist_194: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVlist_198, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QV; return; }
      case ARTL_ART_QVlist_198: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal QVlist: match production*/
      case ARTL_ART_QVlist_202: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVlist_206, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QV; return; }
      case ARTL_ART_QVlist_206: 
        /* Nonterminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_QVlist_208, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVlist_210, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QVlist; return; }
      case ARTL_ART_QVlist_210: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_QVsig() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal QVsig production descriptor loads*/
      case ARTL_ART_QVsig: 
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QVsig_122, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QVsig_128, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QVsig_138, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet14[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QVsig_150, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet15[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QVsig_156, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet24[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_QVsig_162, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal QVsig: match production*/
      case ARTL_ART_QVsig_122: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVsig_124, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_QVsig_124: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal QVsig: match production*/
      case ARTL_ART_QVsig_128: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_QVsig_132, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVsig_134, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_QVsig_134: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal QVsig: match production*/
      case ARTL_ART_QVsig_138: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVsig_140, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_QVsig_140: 
        /* Nonterminal template end */
        if (!ARTSet13[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_QVsig_142, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet21[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVsig_144, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QVlist; return; }
      case ARTL_ART_QVsig_144: 
        /* Nonterminal template end */
        if (!ARTSet6[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RBRACK, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_QVsig_146, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal QVsig: match production*/
      case ARTL_ART_QVsig_150: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVsig_152, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_STRING_SQ; return; }
      case ARTL_ART_QVsig_152: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal QVsig: match production*/
      case ARTL_ART_QVsig_156: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__HASH, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_QVsig_158, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal QVsig: match production*/
      case ARTL_ART_QVsig_162: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_QVsig_164, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVsig_166, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QV; return; }
      case ARTL_ART_QVsig_166: 
        /* Nonterminal template end */
        if (!ARTSet25[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__QUERY, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_QVsig_168, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_QVsig_170, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QV; return; }
      case ARTL_ART_QVsig_170: 
        /* Nonterminal template end */
        if (!ARTSet26[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__RPAR, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_QVsig_172, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet23[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAG() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAG production descriptor loads*/
      case ARTL_ART_RAG: 
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAG_30, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet27[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAG_36, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAG: match production*/
      case ARTL_ART_RAG_30: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAG_32, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGrule; return; }
      case ARTL_ART_RAG_32: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAG: match production*/
      case ARTL_ART_RAG_36: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAG_38, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGrule; return; }
      case ARTL_ART_RAG_38: 
        /* Nonterminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAG_40, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAG; return; }
      case ARTL_ART_RAG_40: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGIDList() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGIDList production descriptor loads*/
      case ARTL_ART_RAGIDList: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGIDList_352, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGIDList_362, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGIDList: match production*/
      case ARTL_ART_RAGIDList_352: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGIDList_356, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGIDList_358, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_RAGIDList_358: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGIDList: match production*/
      case ARTL_ART_RAGIDList_362: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGIDList_366, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGIDList_368, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_RAGIDList_368: 
        /* Nonterminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGIDList_370, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGIDList_372, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGIDList; return; }
      case ARTL_ART_RAGIDList_372: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGRangeCond() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGRangeCond production descriptor loads*/
      case ARTL_ART_RAGRangeCond: 
        if (ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRangeCond_376, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGRangeCond: match production*/
      case ARTL_ART_RAGRangeCond_376: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRangeCond_380, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGRangeCond_382, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_RAGRangeCond_382: 
        /* Nonterminal template end */
        if (!ARTSet33[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SHREIK_EQUAL, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRangeCond_384, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRangeCond_386, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGRangeCond_388, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_RAGRangeCond_388: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGRangeDef() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGRangeDef production descriptor loads*/
      case ARTL_ART_RAGRangeDef: 
        if (ARTSet31[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRangeDef_340, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGRangeDef: match production*/
      case ARTL_ART_RAGRangeDef_340: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGRangeDef_344, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGIDList; return; }
      case ARTL_ART_RAGRangeDef_344: 
        /* Nonterminal template end */
        if (!ARTSet30[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRangeDef_346, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet34[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGRangeDef_348, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGRangeSet; return; }
      case ARTL_ART_RAGRangeDef_348: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGRangeExpr() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGRangeExpr production descriptor loads*/
      case ARTL_ART_RAGRangeExpr: 
        if (ARTSet36[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRangeExpr_324, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet37[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRangeExpr_332, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGRangeExpr: match production*/
      case ARTL_ART_RAGRangeExpr_324: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGRangeExpr_328, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGRangeDef; return; }
      case ARTL_ART_RAGRangeExpr_328: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGRangeExpr: match production*/
      case ARTL_ART_RAGRangeExpr_332: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGRangeExpr_336, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGRangeCond; return; }
      case ARTL_ART_RAGRangeExpr_336: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGRangeSet() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGRangeSet production descriptor loads*/
      case ARTL_ART_RAGRangeSet: 
        if (ARTSet39[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRangeSet_392, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet40[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRangeSet_398, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet41[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRangeSet_404, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGRangeSet: match production*/
      case ARTL_ART_RAGRangeSet_392: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSANDLETTER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRangeSet_394, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGRangeSet: match production*/
      case ARTL_ART_RAGRangeSet_398: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSANDWORD, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRangeSet_400, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGRangeSet: match production*/
      case ARTL_ART_RAGRangeSet_404: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSANDANSWER, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRangeSet_406, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGRanges() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGRanges production descriptor loads*/
      case ARTL_ART_RAGRanges: 
        if (ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRanges_306, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet44[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGRanges_312, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGRanges: match production*/
      case ARTL_ART_RAGRanges_306: 
        /* Cat/unary template start */
        /* Epsilon template start */
        artCurrentSPPFRightChildNode = artFindSPPFEpsilon(artCurrentInputPairIndex);
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRanges_310, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Epsilon template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGRanges: match production*/
      case ARTL_ART_RAGRanges_312: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGRanges_316, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGRangeExpr; return; }
      case ARTL_ART_RAGRanges_316: 
        /* Nonterminal template end */
        if (!ARTSet32[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__SEMICOLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGRanges_318, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGRanges_320, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGRanges; return; }
      case ARTL_ART_RAGRanges_320: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGname() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGname production descriptor loads*/
      case ARTL_ART_RAGname: 
        if (ARTSet47[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGname_14, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGname: match production*/
      case ARTL_ART_RAGname_14: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Name_COLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGname_16, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGname_18, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_RAGname_18: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGrhs() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGrhs production descriptor loads*/
      case ARTL_ART_RAGrhs: 
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGrhs_236, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGrhs_242, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGrhs_260, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGrhs_268, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        if (ARTSet53[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGrhs_288, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGrhs: match production*/
      case ARTL_ART_RAGrhs_236: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrhs_238, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AVsig; return; }
      case ARTL_ART_RAGrhs_238: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGrhs: match production*/
      case ARTL_ART_RAGrhs_242: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_246, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrhs_248, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QV; return; }
      case ARTL_ART_RAGrhs_248: 
        /* Nonterminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_250, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_252, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrhs_254, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_RAGrhs_254: 
        /* Nonterminal template end */
        if (!ARTSet51[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_256, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGrhs: match production*/
      case ARTL_ART_RAGrhs_260: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrhs_262, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AVsig; return; }
      case ARTL_ART_RAGrhs_262: 
        /* Nonterminal template end */
        if (!ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrhs_264, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGrhs; return; }
      case ARTL_ART_RAGrhs_264: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGrhs: match production*/
      case ARTL_ART_RAGrhs_268: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_272, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrhs_274, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QV; return; }
      case ARTL_ART_RAGrhs_274: 
        /* Nonterminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_276, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet12[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__AMPERSAND, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_278, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet11[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrhs_280, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_ID; return; }
      case ARTL_ART_RAGrhs_280: 
        /* Nonterminal template end */
        if (!ARTSet51[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_282, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrhs_284, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGrhs; return; }
      case ARTL_ART_RAGrhs_284: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
        /* Nonterminal RAGrhs: match production*/
      case ARTL_ART_RAGrhs_288: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LBRACE_RBRACE, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrhs_290, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGrule() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGrule production descriptor loads*/
      case ARTL_ART_RAGrule: 
        if (ARTSet46[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGrule_214, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGrule: match production*/
      case ARTL_ART_RAGrule_214: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrule_218, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGRanges; return; }
      case ARTL_ART_RAGrule_218: 
        /* Nonterminal template end */
        if (!ARTSet43[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__LT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrule_220, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrule_222, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AVsig; return; }
      case ARTL_ART_RAGrule_222: 
        /* Nonterminal template end */
        if (!ARTSet7[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__COMMA, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrule_224, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet20[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrule_226, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_QV; return; }
      case ARTL_ART_RAGrule_226: 
        /* Nonterminal template end */
        if (!ARTSet51[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrule_228, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet54[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS__MINUS_GT, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGrule_230, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet52[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGrule_232, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGrhs; return; }
      case ARTL_ART_RAGrule_232: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet50[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_RAGstartsymbol() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal RAGstartsymbol production descriptor loads*/
      case ARTL_ART_RAGstartsymbol: 
        if (ARTSet55[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_RAGstartsymbol_22, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal RAGstartsymbol: match production*/
      case ARTL_ART_RAGstartsymbol_22: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTS_Start_COLON, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_RAGstartsymbol_24, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        if (!ARTSet2[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_RAGstartsymbol_26, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_AVsig; return; }
      case ARTL_ART_RAGstartsymbol_26: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_STRING_SQ() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal STRING_SQ production descriptor loads*/
      case ARTL_ART_STRING_SQ: 
        if (ARTSet56[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_STRING_SQ_300, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal STRING_SQ: match production*/
      case ARTL_ART_STRING_SQ_300: 
        /* Cat/unary template start */
        /* Terminal template start */
        artCurrentInputPairReference = artInputSuccessorIndex[artInputPairBuffer[artCurrentInputPairReference + 1]][artInputPairBuffer[artCurrentInputPairReference]];
        artCurrentSPPFRightChildNode = artFindSPPFTerminal(ARTTB_STRING_SQ, artCurrentInputPairIndex, artInputPairBuffer[artCurrentInputPairReference + 1]);
        artCurrentInputPairIndex = artInputPairBuffer[artCurrentInputPairReference + 1];
        artCurrentSPPFNode = artFindSPPF(ARTL_ART_STRING_SQ_302, artCurrentSPPFNode, artCurrentSPPFRightChildNode);
        /* Terminal template end */
        /* Cat/unary template end */
        if (!ARTSet57[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void ARTPF_ART_Start() {
    switch (artCurrentRestartLabel) {
        /* Nonterminal Start production descriptor loads*/
      case ARTL_ART_Start: 
        if (ARTSet58[artInputPairBuffer[artCurrentInputPairReference]]) 
          artFindDescriptor(ARTL_ART_Start_2, artCurrentGSSNode, artCurrentInputPairIndex, artDummySPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal Start: match production*/
      case ARTL_ART_Start_2: 
        /* Cat/unary template start */
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_Start_6, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGname; return; }
      case ARTL_ART_Start_6: 
        /* Nonterminal template end */
        if (!ARTSet48[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_Start_8, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAGstartsymbol; return; }
      case ARTL_ART_Start_8: 
        /* Nonterminal template end */
        if (!ARTSet29[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        /* Nonterminal template start */
        artCurrentGSSNode = artFindGSS(ARTL_ART_Start_10, artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTL_ART_RAG; return; }
      case ARTL_ART_Start_10: 
        /* Nonterminal template end */
        /* Cat/unary template end */
        if (!ARTSet28[artInputPairBuffer[artCurrentInputPairReference]]) { artCurrentRestartLabel = ARTX_DESPATCH; return; }
        artPop(artCurrentGSSNode, artCurrentInputPairIndex, artCurrentSPPFNode);
        { artCurrentRestartLabel = ARTX_DESPATCH /* Top level pop */; return; }
    }
  }

  public void artParseBody(String artInputString, int artStartLabel) throws ARTException {
    this.artInputString = artInputString;
    artSetupCompleteTime = artReadClock();
    artStartSymbolLabel = artStartLabel;
    artIsInLanguage = false;
    artTokenExtent = 45;
    artLexicaliseForV3GLL(artInputString, null);
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
        case ARTL_ART_AV: 
          ARTPF_ART_AV();
          break;
        case ARTL_ART_AVarglist: 
          ARTPF_ART_AVarglist();
          break;
        case ARTL_ART_AVsig: 
          ARTPF_ART_AVsig();
          break;
        case ARTL_ART_ID: 
          ARTPF_ART_ID();
          break;
        case ARTL_ART_QV: 
          ARTPF_ART_QV();
          break;
        case ARTL_ART_QVlist: 
          ARTPF_ART_QVlist();
          break;
        case ARTL_ART_QVsig: 
          ARTPF_ART_QVsig();
          break;
        case ARTL_ART_RAG: 
          ARTPF_ART_RAG();
          break;
        case ARTL_ART_RAGIDList: 
          ARTPF_ART_RAGIDList();
          break;
        case ARTL_ART_RAGRangeCond: 
          ARTPF_ART_RAGRangeCond();
          break;
        case ARTL_ART_RAGRangeDef: 
          ARTPF_ART_RAGRangeDef();
          break;
        case ARTL_ART_RAGRangeExpr: 
          ARTPF_ART_RAGRangeExpr();
          break;
        case ARTL_ART_RAGRangeSet: 
          ARTPF_ART_RAGRangeSet();
          break;
        case ARTL_ART_RAGRanges: 
          ARTPF_ART_RAGRanges();
          break;
        case ARTL_ART_RAGname: 
          ARTPF_ART_RAGname();
          break;
        case ARTL_ART_RAGrhs: 
          ARTPF_ART_RAGrhs();
          break;
        case ARTL_ART_RAGrule: 
          ARTPF_ART_RAGrule();
          break;
        case ARTL_ART_RAGstartsymbol: 
          ARTPF_ART_RAGstartsymbol();
          break;
        case ARTL_ART_STRING_SQ: 
          ARTPF_ART_STRING_SQ();
          break;
        case ARTL_ART_Start: 
          ARTPF_ART_Start();
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

  public void ARTSet3initialise() {
    ARTSet3 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet3, 0, artSetExtent, false);
    ARTSet3[ARTTS__COMMA] = true;
    ARTSet3[ARTTS__RBRACK] = true;
  }

  public void ARTSet42initialise() {
    ARTSet42 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet42, 0, artSetExtent, false);
    ARTSet42[ARTTS__AMPERSAND] = true;
    ARTSet42[ARTL_ART_RAGIDList] = true;
    ARTSet42[ARTL_ART_RAGRangeCond] = true;
    ARTSet42[ARTL_ART_RAGRangeDef] = true;
    ARTSet42[ARTL_ART_RAGRangeExpr] = true;
  }

  public void ARTSet58initialise() {
    ARTSet58 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet58, 0, artSetExtent, false);
    ARTSet58[ARTTS_Name_COLON] = true;
    ARTSet58[ARTL_ART_RAGname] = true;
  }

  public void ARTSet55initialise() {
    ARTSet55 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet55, 0, artSetExtent, false);
    ARTSet55[ARTTS_Start_COLON] = true;
  }

  public void ARTSet18initialise() {
    ARTSet18 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet18, 0, artSetExtent, false);
    ARTSet18[ARTTB_ID] = true;
    ARTSet18[ARTTB_STRING_SQ] = true;
    ARTSet18[ARTTS__HASH] = true;
    ARTSet18[ARTTS__AMPERSAND] = true;
    ARTSet18[ARTTS__LPAR] = true;
    ARTSet18[ARTL_ART_ID] = true;
    ARTSet18[ARTL_ART_QVsig] = true;
    ARTSet18[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet47initialise() {
    ARTSet47 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet47, 0, artSetExtent, false);
    ARTSet47[ARTTS_Name_COLON] = true;
  }

  public void ARTSet27initialise() {
    ARTSet27 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet27, 0, artSetExtent, false);
    ARTSet27[ARTTS__AMPERSAND] = true;
    ARTSet27[ARTTS__LT] = true;
    ARTSet27[ARTL_ART_RAGIDList] = true;
    ARTSet27[ARTL_ART_RAGRangeCond] = true;
    ARTSet27[ARTL_ART_RAGRangeDef] = true;
    ARTSet27[ARTL_ART_RAGRangeExpr] = true;
    ARTSet27[ARTL_ART_RAGRanges] = true;
    ARTSet27[ARTL_ART_RAGrule] = true;
  }

  public void ARTSet39initialise() {
    ARTSet39 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet39, 0, artSetExtent, false);
    ARTSet39[ARTTS__AMPERSANDLETTER] = true;
  }

  public void ARTSet19initialise() {
    ARTSet19 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet19, 0, artSetExtent, false);
    ARTSet19[ARTTS__RPAR] = true;
    ARTSet19[ARTTS__COMMA] = true;
    ARTSet19[ARTTS__GT] = true;
    ARTSet19[ARTTS__QUERY] = true;
    ARTSet19[ARTTS__RBRACK] = true;
  }

  public void ARTSet22initialise() {
    ARTSet22 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet22, 0, artSetExtent, false);
    ARTSet22[ARTTB_ID] = true;
    ARTSet22[ARTTB_STRING_SQ] = true;
    ARTSet22[ARTTS__HASH] = true;
    ARTSet22[ARTTS__AMPERSAND] = true;
    ARTSet22[ARTTS__LPAR] = true;
    ARTSet22[ARTL_ART_ID] = true;
    ARTSet22[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet15initialise() {
    ARTSet15 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet15, 0, artSetExtent, false);
    ARTSet15[ARTTS__HASH] = true;
  }

  public void ARTSet50initialise() {
    ARTSet50 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet50, 0, artSetExtent, false);
    ARTSet50[ARTX_EOS] = true;
    ARTSet50[ARTTS__AMPERSAND] = true;
    ARTSet50[ARTTS__LT] = true;
    ARTSet50[ARTL_ART_RAG] = true;
    ARTSet50[ARTL_ART_RAGIDList] = true;
    ARTSet50[ARTL_ART_RAGRangeCond] = true;
    ARTSet50[ARTL_ART_RAGRangeDef] = true;
    ARTSet50[ARTL_ART_RAGRangeExpr] = true;
    ARTSet50[ARTL_ART_RAGRanges] = true;
    ARTSet50[ARTL_ART_RAGrule] = true;
  }

  public void ARTSet12initialise() {
    ARTSet12 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet12, 0, artSetExtent, false);
    ARTSet12[ARTTS__AMPERSAND] = true;
  }

  public void ARTSet24initialise() {
    ARTSet24 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet24, 0, artSetExtent, false);
    ARTSet24[ARTTS__LPAR] = true;
  }

  public void ARTSet26initialise() {
    ARTSet26 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet26, 0, artSetExtent, false);
    ARTSet26[ARTTS__RPAR] = true;
  }

  public void ARTSet45initialise() {
    ARTSet45 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet45, 0, artSetExtent, false);
    ARTSet45[ARTTS__AMPERSAND] = true;
    ARTSet45[ARTL_ART_RAGIDList] = true;
    ARTSet45[ARTL_ART_RAGRangeCond] = true;
    ARTSet45[ARTL_ART_RAGRangeDef] = true;
    ARTSet45[ARTL_ART_RAGRangeExpr] = true;
    ARTSet45[ARTL_ART_RAGRanges] = true;
  }

  public void ARTSet7initialise() {
    ARTSet7 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet7, 0, artSetExtent, false);
    ARTSet7[ARTTS__COMMA] = true;
  }

  public void ARTSet10initialise() {
    ARTSet10 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet10, 0, artSetExtent, false);
    ARTSet10[ARTX_EOS] = true;
    ARTSet10[ARTTB_ID] = true;
    ARTSet10[ARTTB_STRING_SQ] = true;
    ARTSet10[ARTTS__HASH] = true;
    ARTSet10[ARTTS__AMPERSAND] = true;
    ARTSet10[ARTTS__COMMA] = true;
    ARTSet10[ARTTS__LT] = true;
    ARTSet10[ARTTS__RBRACK] = true;
    ARTSet10[ARTTS__LBRACE_RBRACE] = true;
    ARTSet10[ARTL_ART_AV] = true;
    ARTSet10[ARTL_ART_AVsig] = true;
    ARTSet10[ARTL_ART_ID] = true;
    ARTSet10[ARTL_ART_RAG] = true;
    ARTSet10[ARTL_ART_RAGIDList] = true;
    ARTSet10[ARTL_ART_RAGRangeCond] = true;
    ARTSet10[ARTL_ART_RAGRangeDef] = true;
    ARTSet10[ARTL_ART_RAGRangeExpr] = true;
    ARTSet10[ARTL_ART_RAGRanges] = true;
    ARTSet10[ARTL_ART_RAGrhs] = true;
    ARTSet10[ARTL_ART_RAGrule] = true;
    ARTSet10[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet46initialise() {
    ARTSet46 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet46, 0, artSetExtent, false);
    ARTSet46[ARTTS__AMPERSAND] = true;
    ARTSet46[ARTTS__LT] = true;
    ARTSet46[ARTL_ART_RAGIDList] = true;
    ARTSet46[ARTL_ART_RAGRangeCond] = true;
    ARTSet46[ARTL_ART_RAGRangeDef] = true;
    ARTSet46[ARTL_ART_RAGRangeExpr] = true;
    ARTSet46[ARTL_ART_RAGRanges] = true;
  }

  public void ARTSet54initialise() {
    ARTSet54 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet54, 0, artSetExtent, false);
    ARTSet54[ARTTS__MINUS_GT] = true;
  }

  public void ARTSet30initialise() {
    ARTSet30 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet30, 0, artSetExtent, false);
    ARTSet30[ARTTS__COLON] = true;
  }

  public void ARTSet32initialise() {
    ARTSet32 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet32, 0, artSetExtent, false);
    ARTSet32[ARTTS__SEMICOLON] = true;
  }

  public void ARTSet34initialise() {
    ARTSet34 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet34, 0, artSetExtent, false);
    ARTSet34[ARTTS__AMPERSANDANSWER] = true;
    ARTSet34[ARTTS__AMPERSANDLETTER] = true;
    ARTSet34[ARTTS__AMPERSANDWORD] = true;
    ARTSet34[ARTL_ART_RAGRangeSet] = true;
  }

  public void ARTSet33initialise() {
    ARTSet33 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet33, 0, artSetExtent, false);
    ARTSet33[ARTTS__SHREIK_EQUAL] = true;
  }

  public void ARTSet43initialise() {
    ARTSet43 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet43, 0, artSetExtent, false);
    ARTSet43[ARTTS__LT] = true;
  }

  public void ARTSet4initialise() {
    ARTSet4 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet4, 0, artSetExtent, false);
  }

  public void ARTSet51initialise() {
    ARTSet51 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet51, 0, artSetExtent, false);
    ARTSet51[ARTTS__GT] = true;
  }

  public void ARTSet25initialise() {
    ARTSet25 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet25, 0, artSetExtent, false);
    ARTSet25[ARTTS__QUERY] = true;
  }

  public void ARTSet35initialise() {
    ARTSet35 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet35, 0, artSetExtent, false);
    ARTSet35[ARTTS__AMPERSAND] = true;
    ARTSet35[ARTL_ART_RAGIDList] = true;
    ARTSet35[ARTL_ART_RAGRangeCond] = true;
    ARTSet35[ARTL_ART_RAGRangeDef] = true;
  }

  public void ARTSet36initialise() {
    ARTSet36 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet36, 0, artSetExtent, false);
    ARTSet36[ARTTS__AMPERSAND] = true;
    ARTSet36[ARTL_ART_RAGIDList] = true;
    ARTSet36[ARTL_ART_RAGRangeDef] = true;
  }

  public void ARTSet52initialise() {
    ARTSet52 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet52, 0, artSetExtent, false);
    ARTSet52[ARTTB_ID] = true;
    ARTSet52[ARTTB_STRING_SQ] = true;
    ARTSet52[ARTTS__HASH] = true;
    ARTSet52[ARTTS__AMPERSAND] = true;
    ARTSet52[ARTTS__LT] = true;
    ARTSet52[ARTTS__LBRACE_RBRACE] = true;
    ARTSet52[ARTL_ART_AVsig] = true;
    ARTSet52[ARTL_ART_ID] = true;
    ARTSet52[ARTL_ART_RAGrhs] = true;
    ARTSet52[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet28initialise() {
    ARTSet28 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet28, 0, artSetExtent, false);
    ARTSet28[ARTX_EOS] = true;
  }

  public void ARTSet11initialise() {
    ARTSet11 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet11, 0, artSetExtent, false);
    ARTSet11[ARTTB_ID] = true;
    ARTSet11[ARTL_ART_ID] = true;
  }

  public void ARTSet17initialise() {
    ARTSet17 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet17, 0, artSetExtent, false);
    ARTSet17[ARTX_EOS] = true;
    ARTSet17[ARTTB_ID] = true;
    ARTSet17[ARTTB_STRING_SQ] = true;
    ARTSet17[ARTTS__SHREIK_EQUAL] = true;
    ARTSet17[ARTTS__HASH] = true;
    ARTSet17[ARTTS__AMPERSAND] = true;
    ARTSet17[ARTTS__LPAR] = true;
    ARTSet17[ARTTS__RPAR] = true;
    ARTSet17[ARTTS__COMMA] = true;
    ARTSet17[ARTTS__COLON] = true;
    ARTSet17[ARTTS__SEMICOLON] = true;
    ARTSet17[ARTTS__LT] = true;
    ARTSet17[ARTTS__GT] = true;
    ARTSet17[ARTTS__QUERY] = true;
    ARTSet17[ARTTS_Start_COLON] = true;
    ARTSet17[ARTTS__LBRACK] = true;
    ARTSet17[ARTTS__RBRACK] = true;
    ARTSet17[ARTTS__LBRACE_RBRACE] = true;
    ARTSet17[ARTL_ART_AV] = true;
    ARTSet17[ARTL_ART_AVsig] = true;
    ARTSet17[ARTL_ART_ID] = true;
    ARTSet17[ARTL_ART_QV] = true;
    ARTSet17[ARTL_ART_QVsig] = true;
    ARTSet17[ARTL_ART_RAG] = true;
    ARTSet17[ARTL_ART_RAGIDList] = true;
    ARTSet17[ARTL_ART_RAGRangeCond] = true;
    ARTSet17[ARTL_ART_RAGRangeDef] = true;
    ARTSet17[ARTL_ART_RAGRangeExpr] = true;
    ARTSet17[ARTL_ART_RAGRanges] = true;
    ARTSet17[ARTL_ART_RAGrhs] = true;
    ARTSet17[ARTL_ART_RAGrule] = true;
    ARTSet17[ARTL_ART_RAGstartsymbol] = true;
    ARTSet17[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet8initialise() {
    ARTSet8 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet8, 0, artSetExtent, false);
    ARTSet8[ARTTB_ID] = true;
    ARTSet8[ARTTB_STRING_SQ] = true;
    ARTSet8[ARTTS__HASH] = true;
    ARTSet8[ARTTS__AMPERSAND] = true;
    ARTSet8[ARTL_ART_AV] = true;
    ARTSet8[ARTL_ART_AVarglist] = true;
    ARTSet8[ARTL_ART_AVsig] = true;
    ARTSet8[ARTL_ART_ID] = true;
    ARTSet8[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet38initialise() {
    ARTSet38 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet38, 0, artSetExtent, false);
    ARTSet38[ARTTS__AMPERSANDANSWER] = true;
    ARTSet38[ARTTS__AMPERSANDLETTER] = true;
    ARTSet38[ARTTS__AMPERSANDWORD] = true;
  }

  public void ARTSet37initialise() {
    ARTSet37 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet37, 0, artSetExtent, false);
    ARTSet37[ARTTS__AMPERSAND] = true;
    ARTSet37[ARTL_ART_RAGRangeCond] = true;
  }

  public void ARTSet23initialise() {
    ARTSet23 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet23, 0, artSetExtent, false);
    ARTSet23[ARTTB_ID] = true;
    ARTSet23[ARTTB_STRING_SQ] = true;
    ARTSet23[ARTTS__HASH] = true;
    ARTSet23[ARTTS__AMPERSAND] = true;
    ARTSet23[ARTTS__LPAR] = true;
    ARTSet23[ARTTS__RPAR] = true;
    ARTSet23[ARTTS__COMMA] = true;
    ARTSet23[ARTTS__GT] = true;
    ARTSet23[ARTTS__QUERY] = true;
    ARTSet23[ARTTS__RBRACK] = true;
    ARTSet23[ARTL_ART_ID] = true;
    ARTSet23[ARTL_ART_QV] = true;
    ARTSet23[ARTL_ART_QVsig] = true;
    ARTSet23[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet57initialise() {
    ARTSet57 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet57, 0, artSetExtent, false);
    ARTSet57[ARTX_EOS] = true;
    ARTSet57[ARTTB_ID] = true;
    ARTSet57[ARTTB_STRING_SQ] = true;
    ARTSet57[ARTTS__HASH] = true;
    ARTSet57[ARTTS__AMPERSAND] = true;
    ARTSet57[ARTTS__LPAR] = true;
    ARTSet57[ARTTS__RPAR] = true;
    ARTSet57[ARTTS__COMMA] = true;
    ARTSet57[ARTTS__LT] = true;
    ARTSet57[ARTTS__GT] = true;
    ARTSet57[ARTTS__QUERY] = true;
    ARTSet57[ARTTS__RBRACK] = true;
    ARTSet57[ARTTS__LBRACE_RBRACE] = true;
    ARTSet57[ARTL_ART_AV] = true;
    ARTSet57[ARTL_ART_AVsig] = true;
    ARTSet57[ARTL_ART_ID] = true;
    ARTSet57[ARTL_ART_QV] = true;
    ARTSet57[ARTL_ART_QVsig] = true;
    ARTSet57[ARTL_ART_RAG] = true;
    ARTSet57[ARTL_ART_RAGIDList] = true;
    ARTSet57[ARTL_ART_RAGRangeCond] = true;
    ARTSet57[ARTL_ART_RAGRangeDef] = true;
    ARTSet57[ARTL_ART_RAGRangeExpr] = true;
    ARTSet57[ARTL_ART_RAGRanges] = true;
    ARTSet57[ARTL_ART_RAGrhs] = true;
    ARTSet57[ARTL_ART_RAGrule] = true;
    ARTSet57[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet13initialise() {
    ARTSet13 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet13, 0, artSetExtent, false);
    ARTSet13[ARTTS__LBRACK] = true;
  }

  public void ARTSet6initialise() {
    ARTSet6 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet6, 0, artSetExtent, false);
    ARTSet6[ARTTS__RBRACK] = true;
  }

  public void ARTSet16initialise() {
    ARTSet16 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet16, 0, artSetExtent, false);
    ARTSet16[ARTTB_ID] = true;
  }

  public void ARTSet49initialise() {
    ARTSet49 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet49, 0, artSetExtent, false);
    ARTSet49[ARTTB_ID] = true;
    ARTSet49[ARTTB_STRING_SQ] = true;
    ARTSet49[ARTTS__HASH] = true;
    ARTSet49[ARTTS__AMPERSAND] = true;
    ARTSet49[ARTTS__LT] = true;
    ARTSet49[ARTTS__LBRACE_RBRACE] = true;
    ARTSet49[ARTL_ART_AVsig] = true;
    ARTSet49[ARTL_ART_ID] = true;
    ARTSet49[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet56initialise() {
    ARTSet56 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet56, 0, artSetExtent, false);
    ARTSet56[ARTTB_STRING_SQ] = true;
  }

  public void ARTSet44initialise() {
    ARTSet44 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet44, 0, artSetExtent, false);
    ARTSet44[ARTTS__AMPERSAND] = true;
    ARTSet44[ARTL_ART_RAGIDList] = true;
    ARTSet44[ARTL_ART_RAGRangeCond] = true;
    ARTSet44[ARTL_ART_RAGRangeDef] = true;
    ARTSet44[ARTL_ART_RAGRangeExpr] = true;
  }

  public void ARTSet5initialise() {
    ARTSet5 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet5, 0, artSetExtent, false);
    ARTSet5[ARTTB_ID] = true;
    ARTSet5[ARTTB_STRING_SQ] = true;
    ARTSet5[ARTTS__HASH] = true;
    ARTSet5[ARTTS__AMPERSAND] = true;
    ARTSet5[ARTL_ART_AV] = true;
    ARTSet5[ARTL_ART_AVsig] = true;
    ARTSet5[ARTL_ART_ID] = true;
    ARTSet5[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet53initialise() {
    ARTSet53 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet53, 0, artSetExtent, false);
    ARTSet53[ARTTS__LBRACE_RBRACE] = true;
  }

  public void ARTSet48initialise() {
    ARTSet48 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet48, 0, artSetExtent, false);
    ARTSet48[ARTTS_Start_COLON] = true;
    ARTSet48[ARTL_ART_RAGstartsymbol] = true;
  }

  public void ARTSet9initialise() {
    ARTSet9 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet9, 0, artSetExtent, false);
    ARTSet9[ARTTB_ID] = true;
    ARTSet9[ARTTB_STRING_SQ] = true;
    ARTSet9[ARTTS__HASH] = true;
    ARTSet9[ARTTS__AMPERSAND] = true;
    ARTSet9[ARTL_ART_ID] = true;
    ARTSet9[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet21initialise() {
    ARTSet21 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet21, 0, artSetExtent, false);
    ARTSet21[ARTTB_ID] = true;
    ARTSet21[ARTTB_STRING_SQ] = true;
    ARTSet21[ARTTS__HASH] = true;
    ARTSet21[ARTTS__AMPERSAND] = true;
    ARTSet21[ARTTS__LPAR] = true;
    ARTSet21[ARTL_ART_ID] = true;
    ARTSet21[ARTL_ART_QV] = true;
    ARTSet21[ARTL_ART_QVlist] = true;
    ARTSet21[ARTL_ART_QVsig] = true;
    ARTSet21[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet41initialise() {
    ARTSet41 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet41, 0, artSetExtent, false);
    ARTSet41[ARTTS__AMPERSANDANSWER] = true;
  }

  public void ARTSet14initialise() {
    ARTSet14 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet14, 0, artSetExtent, false);
    ARTSet14[ARTTB_STRING_SQ] = true;
    ARTSet14[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet40initialise() {
    ARTSet40 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet40, 0, artSetExtent, false);
    ARTSet40[ARTTS__AMPERSANDWORD] = true;
  }

  public void ARTSet20initialise() {
    ARTSet20 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet20, 0, artSetExtent, false);
    ARTSet20[ARTTB_ID] = true;
    ARTSet20[ARTTB_STRING_SQ] = true;
    ARTSet20[ARTTS__HASH] = true;
    ARTSet20[ARTTS__AMPERSAND] = true;
    ARTSet20[ARTTS__LPAR] = true;
    ARTSet20[ARTL_ART_ID] = true;
    ARTSet20[ARTL_ART_QV] = true;
    ARTSet20[ARTL_ART_QVsig] = true;
    ARTSet20[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet31initialise() {
    ARTSet31 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet31, 0, artSetExtent, false);
    ARTSet31[ARTTS__AMPERSAND] = true;
    ARTSet31[ARTL_ART_RAGIDList] = true;
  }

  public void ARTSet2initialise() {
    ARTSet2 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet2, 0, artSetExtent, false);
    ARTSet2[ARTTB_ID] = true;
    ARTSet2[ARTTB_STRING_SQ] = true;
    ARTSet2[ARTTS__HASH] = true;
    ARTSet2[ARTTS__AMPERSAND] = true;
    ARTSet2[ARTL_ART_AVsig] = true;
    ARTSet2[ARTL_ART_ID] = true;
    ARTSet2[ARTL_ART_STRING_SQ] = true;
  }

  public void ARTSet29initialise() {
    ARTSet29 = new boolean[artSetExtent];
    artInitialiseBooleanArray(ARTSet29, 0, artSetExtent, false);
    ARTSet29[ARTTS__AMPERSAND] = true;
    ARTSet29[ARTTS__LT] = true;
    ARTSet29[ARTL_ART_RAG] = true;
    ARTSet29[ARTL_ART_RAGIDList] = true;
    ARTSet29[ARTL_ART_RAGRangeCond] = true;
    ARTSet29[ARTL_ART_RAGRangeDef] = true;
    ARTSet29[ARTL_ART_RAGRangeExpr] = true;
    ARTSet29[ARTL_ART_RAGRanges] = true;
    ARTSet29[ARTL_ART_RAGrule] = true;
  }

  public void artSetInitialise() {
    ARTSet1initialise();
    ARTSet3initialise();
    ARTSet42initialise();
    ARTSet58initialise();
    ARTSet55initialise();
    ARTSet18initialise();
    ARTSet47initialise();
    ARTSet27initialise();
    ARTSet39initialise();
    ARTSet19initialise();
    ARTSet22initialise();
    ARTSet15initialise();
    ARTSet50initialise();
    ARTSet12initialise();
    ARTSet24initialise();
    ARTSet26initialise();
    ARTSet45initialise();
    ARTSet7initialise();
    ARTSet10initialise();
    ARTSet46initialise();
    ARTSet54initialise();
    ARTSet30initialise();
    ARTSet32initialise();
    ARTSet34initialise();
    ARTSet33initialise();
    ARTSet43initialise();
    ARTSet4initialise();
    ARTSet51initialise();
    ARTSet25initialise();
    ARTSet35initialise();
    ARTSet36initialise();
    ARTSet52initialise();
    ARTSet28initialise();
    ARTSet11initialise();
    ARTSet17initialise();
    ARTSet8initialise();
    ARTSet38initialise();
    ARTSet37initialise();
    ARTSet23initialise();
    ARTSet57initialise();
    ARTSet13initialise();
    ARTSet6initialise();
    ARTSet16initialise();
    ARTSet49initialise();
    ARTSet56initialise();
    ARTSet44initialise();
    ARTSet5initialise();
    ARTSet53initialise();
    ARTSet48initialise();
    ARTSet9initialise();
    ARTSet21initialise();
    ARTSet41initialise();
    ARTSet14initialise();
    ARTSet40initialise();
    ARTSet20initialise();
    ARTSet31initialise();
    ARTSet2initialise();
    ARTSet29initialise();
  }

  public void artTableInitialiser_ART_AV() {
    artLabelInternalStrings[ARTL_ART_AV] = "AV";
    artLabelStrings[ARTL_ART_AV] = "AV";
    artKindOfs[ARTL_ART_AV] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_AV_84] = "AV ::= . AVsig ";
    artLabelStrings[ARTL_ART_AV_84] = "";
    artlhsL[ARTL_ART_AV_84] = ARTL_ART_AV;
    artKindOfs[ARTL_ART_AV_84] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AV_88] = "AV ::= AVsig .";
    artLabelStrings[ARTL_ART_AV_88] = "";
    artlhsL[ARTL_ART_AV_88] = ARTL_ART_AV;
    artSlotInstanceOfs[ARTL_ART_AV_88] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AV_88] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AV_88] = true;
    arteoR_pL[ARTL_ART_AV_88] = true;
    artPopD[ARTL_ART_AV_88] = true;
    artLabelInternalStrings[ARTL_ART_AV_92] = "AV ::= . AVsig AV ";
    artLabelStrings[ARTL_ART_AV_92] = "";
    artlhsL[ARTL_ART_AV_92] = ARTL_ART_AV;
    artKindOfs[ARTL_ART_AV_92] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AV_96] = "AV ::= AVsig . AV ";
    artLabelStrings[ARTL_ART_AV_96] = "";
    artlhsL[ARTL_ART_AV_96] = ARTL_ART_AV;
    artSlotInstanceOfs[ARTL_ART_AV_96] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AV_96] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_AV_96] = true;
    artLabelInternalStrings[ARTL_ART_AV_98] = "AV ::= AVsig AV .";
    artLabelStrings[ARTL_ART_AV_98] = "";
    artlhsL[ARTL_ART_AV_98] = ARTL_ART_AV;
    artSlotInstanceOfs[ARTL_ART_AV_98] = ARTL_ART_AV;
    artKindOfs[ARTL_ART_AV_98] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AV_98] = true;
    arteoR_pL[ARTL_ART_AV_98] = true;
    artPopD[ARTL_ART_AV_98] = true;
  }

  public void artTableInitialiser_ART_AVarglist() {
    artLabelInternalStrings[ARTL_ART_AVarglist] = "AVarglist";
    artLabelStrings[ARTL_ART_AVarglist] = "AVarglist";
    artKindOfs[ARTL_ART_AVarglist] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_AVarglist_102] = "AVarglist ::= . AV ";
    artLabelStrings[ARTL_ART_AVarglist_102] = "";
    artlhsL[ARTL_ART_AVarglist_102] = ARTL_ART_AVarglist;
    artKindOfs[ARTL_ART_AVarglist_102] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AVarglist_106] = "AVarglist ::= AV .";
    artLabelStrings[ARTL_ART_AVarglist_106] = "";
    artlhsL[ARTL_ART_AVarglist_106] = ARTL_ART_AVarglist;
    artSlotInstanceOfs[ARTL_ART_AVarglist_106] = ARTL_ART_AV;
    artKindOfs[ARTL_ART_AVarglist_106] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AVarglist_106] = true;
    arteoR_pL[ARTL_ART_AVarglist_106] = true;
    artPopD[ARTL_ART_AVarglist_106] = true;
    artLabelInternalStrings[ARTL_ART_AVarglist_110] = "AVarglist ::= . AV ','  AVarglist ";
    artLabelStrings[ARTL_ART_AVarglist_110] = "";
    artlhsL[ARTL_ART_AVarglist_110] = ARTL_ART_AVarglist;
    artKindOfs[ARTL_ART_AVarglist_110] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AVarglist_114] = "AVarglist ::= AV . ','  AVarglist ";
    artLabelStrings[ARTL_ART_AVarglist_114] = "";
    artlhsL[ARTL_ART_AVarglist_114] = ARTL_ART_AVarglist;
    artSlotInstanceOfs[ARTL_ART_AVarglist_114] = ARTL_ART_AV;
    artKindOfs[ARTL_ART_AVarglist_114] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_AVarglist_114] = true;
    artLabelInternalStrings[ARTL_ART_AVarglist_115] = "AVarglist ::= AV ','  AVarglist ";
    artLabelStrings[ARTL_ART_AVarglist_115] = "";
    artlhsL[ARTL_ART_AVarglist_115] = ARTL_ART_AVarglist;
    artLabelInternalStrings[ARTL_ART_AVarglist_116] = "AVarglist ::= AV ','  . AVarglist ";
    artLabelStrings[ARTL_ART_AVarglist_116] = "";
    artlhsL[ARTL_ART_AVarglist_116] = ARTL_ART_AVarglist;
    artKindOfs[ARTL_ART_AVarglist_116] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AVarglist_118] = "AVarglist ::= AV ','  AVarglist .";
    artLabelStrings[ARTL_ART_AVarglist_118] = "";
    artlhsL[ARTL_ART_AVarglist_118] = ARTL_ART_AVarglist;
    artSlotInstanceOfs[ARTL_ART_AVarglist_118] = ARTL_ART_AVarglist;
    artKindOfs[ARTL_ART_AVarglist_118] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AVarglist_118] = true;
    arteoR_pL[ARTL_ART_AVarglist_118] = true;
    artPopD[ARTL_ART_AVarglist_118] = true;
  }

  public void artTableInitialiser_ART_AVsig() {
    artLabelInternalStrings[ARTL_ART_AVsig] = "AVsig";
    artLabelStrings[ARTL_ART_AVsig] = "AVsig";
    artKindOfs[ARTL_ART_AVsig] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_AVsig_44] = "AVsig ::= . ID ";
    artLabelStrings[ARTL_ART_AVsig_44] = "";
    artlhsL[ARTL_ART_AVsig_44] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_44] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AVsig_46] = "AVsig ::= ID .";
    artLabelStrings[ARTL_ART_AVsig_46] = "";
    artlhsL[ARTL_ART_AVsig_46] = ARTL_ART_AVsig;
    artSlotInstanceOfs[ARTL_ART_AVsig_46] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_AVsig_46] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AVsig_46] = true;
    arteoR_pL[ARTL_ART_AVsig_46] = true;
    artPopD[ARTL_ART_AVsig_46] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_50] = "AVsig ::= . '&'  ID ";
    artLabelStrings[ARTL_ART_AVsig_50] = "";
    artlhsL[ARTL_ART_AVsig_50] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_50] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AVsig_53] = "AVsig ::= '&'  ID ";
    artLabelStrings[ARTL_ART_AVsig_53] = "";
    artlhsL[ARTL_ART_AVsig_53] = ARTL_ART_AVsig;
    artLabelInternalStrings[ARTL_ART_AVsig_54] = "AVsig ::= '&'  . ID ";
    artLabelStrings[ARTL_ART_AVsig_54] = "";
    artlhsL[ARTL_ART_AVsig_54] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_54] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_AVsig_54] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_56] = "AVsig ::= '&'  ID .";
    artLabelStrings[ARTL_ART_AVsig_56] = "";
    artlhsL[ARTL_ART_AVsig_56] = ARTL_ART_AVsig;
    artSlotInstanceOfs[ARTL_ART_AVsig_56] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_AVsig_56] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AVsig_56] = true;
    arteoR_pL[ARTL_ART_AVsig_56] = true;
    artPopD[ARTL_ART_AVsig_56] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_60] = "AVsig ::= . ID '['  AVarglist ']'  ";
    artLabelStrings[ARTL_ART_AVsig_60] = "";
    artlhsL[ARTL_ART_AVsig_60] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_60] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AVsig_62] = "AVsig ::= ID . '['  AVarglist ']'  ";
    artLabelStrings[ARTL_ART_AVsig_62] = "";
    artlhsL[ARTL_ART_AVsig_62] = ARTL_ART_AVsig;
    artSlotInstanceOfs[ARTL_ART_AVsig_62] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_AVsig_62] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_AVsig_62] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_63] = "AVsig ::= ID '['  AVarglist ']'  ";
    artLabelStrings[ARTL_ART_AVsig_63] = "";
    artlhsL[ARTL_ART_AVsig_63] = ARTL_ART_AVsig;
    artLabelInternalStrings[ARTL_ART_AVsig_64] = "AVsig ::= ID '['  . AVarglist ']'  ";
    artLabelStrings[ARTL_ART_AVsig_64] = "";
    artlhsL[ARTL_ART_AVsig_64] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_64] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AVsig_66] = "AVsig ::= ID '['  AVarglist . ']'  ";
    artLabelStrings[ARTL_ART_AVsig_66] = "";
    artlhsL[ARTL_ART_AVsig_66] = ARTL_ART_AVsig;
    artSlotInstanceOfs[ARTL_ART_AVsig_66] = ARTL_ART_AVarglist;
    artKindOfs[ARTL_ART_AVsig_66] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_AVsig_66] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_67] = "AVsig ::= ID '['  AVarglist ']'  ";
    artLabelStrings[ARTL_ART_AVsig_67] = "";
    artlhsL[ARTL_ART_AVsig_67] = ARTL_ART_AVsig;
    artPopD[ARTL_ART_AVsig_67] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_68] = "AVsig ::= ID '['  AVarglist ']'  .";
    artLabelStrings[ARTL_ART_AVsig_68] = "";
    artlhsL[ARTL_ART_AVsig_68] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_68] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AVsig_68] = true;
    arteoR_pL[ARTL_ART_AVsig_68] = true;
    artPopD[ARTL_ART_AVsig_68] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_72] = "AVsig ::= . STRING_SQ ";
    artLabelStrings[ARTL_ART_AVsig_72] = "";
    artlhsL[ARTL_ART_AVsig_72] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_72] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_AVsig_74] = "AVsig ::= STRING_SQ .";
    artLabelStrings[ARTL_ART_AVsig_74] = "";
    artlhsL[ARTL_ART_AVsig_74] = ARTL_ART_AVsig;
    artSlotInstanceOfs[ARTL_ART_AVsig_74] = ARTL_ART_STRING_SQ;
    artKindOfs[ARTL_ART_AVsig_74] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AVsig_74] = true;
    arteoR_pL[ARTL_ART_AVsig_74] = true;
    artPopD[ARTL_ART_AVsig_74] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_78] = "AVsig ::= . '#'  ";
    artLabelStrings[ARTL_ART_AVsig_78] = "";
    artlhsL[ARTL_ART_AVsig_78] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_78] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_AVsig_78] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_79] = "AVsig ::= '#'  ";
    artLabelStrings[ARTL_ART_AVsig_79] = "";
    artlhsL[ARTL_ART_AVsig_79] = ARTL_ART_AVsig;
    artPopD[ARTL_ART_AVsig_79] = true;
    artLabelInternalStrings[ARTL_ART_AVsig_80] = "AVsig ::= '#'  .";
    artLabelStrings[ARTL_ART_AVsig_80] = "";
    artlhsL[ARTL_ART_AVsig_80] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_AVsig_80] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_AVsig_80] = true;
    arteoR_pL[ARTL_ART_AVsig_80] = true;
    artPopD[ARTL_ART_AVsig_80] = true;
  }

  public void artTableInitialiser_ART_ID() {
    artLabelInternalStrings[ARTL_ART_ID] = "ID";
    artLabelStrings[ARTL_ART_ID] = "ID";
    artKindOfs[ARTL_ART_ID] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_ID_294] = "ID ::= . &ID  ";
    artLabelStrings[ARTL_ART_ID_294] = "";
    artlhsL[ARTL_ART_ID_294] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_294] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_ID_294] = true;
    artLabelInternalStrings[ARTL_ART_ID_295] = "ID ::= &ID  ";
    artLabelStrings[ARTL_ART_ID_295] = "";
    artlhsL[ARTL_ART_ID_295] = ARTL_ART_ID;
    artPopD[ARTL_ART_ID_295] = true;
    artLabelInternalStrings[ARTL_ART_ID_296] = "ID ::= &ID  .";
    artLabelStrings[ARTL_ART_ID_296] = "";
    artlhsL[ARTL_ART_ID_296] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_ID_296] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_ID_296] = true;
    arteoR_pL[ARTL_ART_ID_296] = true;
    artPopD[ARTL_ART_ID_296] = true;
  }

  public void artTableInitialiser_ART_QV() {
    artLabelInternalStrings[ARTL_ART_QV] = "QV";
    artLabelStrings[ARTL_ART_QV] = "QV";
    artKindOfs[ARTL_ART_QV] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_QV_176] = "QV ::= . QVsig ";
    artLabelStrings[ARTL_ART_QV_176] = "";
    artlhsL[ARTL_ART_QV_176] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_QV_176] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QV_180] = "QV ::= QVsig .";
    artLabelStrings[ARTL_ART_QV_180] = "";
    artlhsL[ARTL_ART_QV_180] = ARTL_ART_QV;
    artSlotInstanceOfs[ARTL_ART_QV_180] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QV_180] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QV_180] = true;
    arteoR_pL[ARTL_ART_QV_180] = true;
    artPopD[ARTL_ART_QV_180] = true;
    artLabelInternalStrings[ARTL_ART_QV_184] = "QV ::= . QVsig QV ";
    artLabelStrings[ARTL_ART_QV_184] = "";
    artlhsL[ARTL_ART_QV_184] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_QV_184] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QV_188] = "QV ::= QVsig . QV ";
    artLabelStrings[ARTL_ART_QV_188] = "";
    artlhsL[ARTL_ART_QV_188] = ARTL_ART_QV;
    artSlotInstanceOfs[ARTL_ART_QV_188] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QV_188] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_QV_188] = true;
    artLabelInternalStrings[ARTL_ART_QV_190] = "QV ::= QVsig QV .";
    artLabelStrings[ARTL_ART_QV_190] = "";
    artlhsL[ARTL_ART_QV_190] = ARTL_ART_QV;
    artSlotInstanceOfs[ARTL_ART_QV_190] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_QV_190] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QV_190] = true;
    arteoR_pL[ARTL_ART_QV_190] = true;
    artPopD[ARTL_ART_QV_190] = true;
  }

  public void artTableInitialiser_ART_QVlist() {
    artLabelInternalStrings[ARTL_ART_QVlist] = "QVlist";
    artLabelStrings[ARTL_ART_QVlist] = "QVlist";
    artKindOfs[ARTL_ART_QVlist] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_QVlist_194] = "QVlist ::= . QV ";
    artLabelStrings[ARTL_ART_QVlist_194] = "";
    artlhsL[ARTL_ART_QVlist_194] = ARTL_ART_QVlist;
    artKindOfs[ARTL_ART_QVlist_194] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVlist_198] = "QVlist ::= QV .";
    artLabelStrings[ARTL_ART_QVlist_198] = "";
    artlhsL[ARTL_ART_QVlist_198] = ARTL_ART_QVlist;
    artSlotInstanceOfs[ARTL_ART_QVlist_198] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_QVlist_198] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QVlist_198] = true;
    arteoR_pL[ARTL_ART_QVlist_198] = true;
    artPopD[ARTL_ART_QVlist_198] = true;
    artLabelInternalStrings[ARTL_ART_QVlist_202] = "QVlist ::= . QV ','  QVlist ";
    artLabelStrings[ARTL_ART_QVlist_202] = "";
    artlhsL[ARTL_ART_QVlist_202] = ARTL_ART_QVlist;
    artKindOfs[ARTL_ART_QVlist_202] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVlist_206] = "QVlist ::= QV . ','  QVlist ";
    artLabelStrings[ARTL_ART_QVlist_206] = "";
    artlhsL[ARTL_ART_QVlist_206] = ARTL_ART_QVlist;
    artSlotInstanceOfs[ARTL_ART_QVlist_206] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_QVlist_206] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_QVlist_206] = true;
    artLabelInternalStrings[ARTL_ART_QVlist_207] = "QVlist ::= QV ','  QVlist ";
    artLabelStrings[ARTL_ART_QVlist_207] = "";
    artlhsL[ARTL_ART_QVlist_207] = ARTL_ART_QVlist;
    artLabelInternalStrings[ARTL_ART_QVlist_208] = "QVlist ::= QV ','  . QVlist ";
    artLabelStrings[ARTL_ART_QVlist_208] = "";
    artlhsL[ARTL_ART_QVlist_208] = ARTL_ART_QVlist;
    artKindOfs[ARTL_ART_QVlist_208] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVlist_210] = "QVlist ::= QV ','  QVlist .";
    artLabelStrings[ARTL_ART_QVlist_210] = "";
    artlhsL[ARTL_ART_QVlist_210] = ARTL_ART_QVlist;
    artSlotInstanceOfs[ARTL_ART_QVlist_210] = ARTL_ART_QVlist;
    artKindOfs[ARTL_ART_QVlist_210] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QVlist_210] = true;
    arteoR_pL[ARTL_ART_QVlist_210] = true;
    artPopD[ARTL_ART_QVlist_210] = true;
  }

  public void artTableInitialiser_ART_QVsig() {
    artLabelInternalStrings[ARTL_ART_QVsig] = "QVsig";
    artLabelStrings[ARTL_ART_QVsig] = "QVsig";
    artKindOfs[ARTL_ART_QVsig] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_QVsig_122] = "QVsig ::= . ID ";
    artLabelStrings[ARTL_ART_QVsig_122] = "";
    artlhsL[ARTL_ART_QVsig_122] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_122] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVsig_124] = "QVsig ::= ID .";
    artLabelStrings[ARTL_ART_QVsig_124] = "";
    artlhsL[ARTL_ART_QVsig_124] = ARTL_ART_QVsig;
    artSlotInstanceOfs[ARTL_ART_QVsig_124] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_QVsig_124] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QVsig_124] = true;
    arteoR_pL[ARTL_ART_QVsig_124] = true;
    artPopD[ARTL_ART_QVsig_124] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_128] = "QVsig ::= . '&'  ID ";
    artLabelStrings[ARTL_ART_QVsig_128] = "";
    artlhsL[ARTL_ART_QVsig_128] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_128] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVsig_131] = "QVsig ::= '&'  ID ";
    artLabelStrings[ARTL_ART_QVsig_131] = "";
    artlhsL[ARTL_ART_QVsig_131] = ARTL_ART_QVsig;
    artLabelInternalStrings[ARTL_ART_QVsig_132] = "QVsig ::= '&'  . ID ";
    artLabelStrings[ARTL_ART_QVsig_132] = "";
    artlhsL[ARTL_ART_QVsig_132] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_132] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_QVsig_132] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_134] = "QVsig ::= '&'  ID .";
    artLabelStrings[ARTL_ART_QVsig_134] = "";
    artlhsL[ARTL_ART_QVsig_134] = ARTL_ART_QVsig;
    artSlotInstanceOfs[ARTL_ART_QVsig_134] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_QVsig_134] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QVsig_134] = true;
    arteoR_pL[ARTL_ART_QVsig_134] = true;
    artPopD[ARTL_ART_QVsig_134] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_138] = "QVsig ::= . ID '['  QVlist ']'  ";
    artLabelStrings[ARTL_ART_QVsig_138] = "";
    artlhsL[ARTL_ART_QVsig_138] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_138] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVsig_140] = "QVsig ::= ID . '['  QVlist ']'  ";
    artLabelStrings[ARTL_ART_QVsig_140] = "";
    artlhsL[ARTL_ART_QVsig_140] = ARTL_ART_QVsig;
    artSlotInstanceOfs[ARTL_ART_QVsig_140] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_QVsig_140] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_QVsig_140] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_141] = "QVsig ::= ID '['  QVlist ']'  ";
    artLabelStrings[ARTL_ART_QVsig_141] = "";
    artlhsL[ARTL_ART_QVsig_141] = ARTL_ART_QVsig;
    artLabelInternalStrings[ARTL_ART_QVsig_142] = "QVsig ::= ID '['  . QVlist ']'  ";
    artLabelStrings[ARTL_ART_QVsig_142] = "";
    artlhsL[ARTL_ART_QVsig_142] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_142] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVsig_144] = "QVsig ::= ID '['  QVlist . ']'  ";
    artLabelStrings[ARTL_ART_QVsig_144] = "";
    artlhsL[ARTL_ART_QVsig_144] = ARTL_ART_QVsig;
    artSlotInstanceOfs[ARTL_ART_QVsig_144] = ARTL_ART_QVlist;
    artKindOfs[ARTL_ART_QVsig_144] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_QVsig_144] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_145] = "QVsig ::= ID '['  QVlist ']'  ";
    artLabelStrings[ARTL_ART_QVsig_145] = "";
    artlhsL[ARTL_ART_QVsig_145] = ARTL_ART_QVsig;
    artPopD[ARTL_ART_QVsig_145] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_146] = "QVsig ::= ID '['  QVlist ']'  .";
    artLabelStrings[ARTL_ART_QVsig_146] = "";
    artlhsL[ARTL_ART_QVsig_146] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_146] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QVsig_146] = true;
    arteoR_pL[ARTL_ART_QVsig_146] = true;
    artPopD[ARTL_ART_QVsig_146] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_150] = "QVsig ::= . STRING_SQ ";
    artLabelStrings[ARTL_ART_QVsig_150] = "";
    artlhsL[ARTL_ART_QVsig_150] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_150] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVsig_152] = "QVsig ::= STRING_SQ .";
    artLabelStrings[ARTL_ART_QVsig_152] = "";
    artlhsL[ARTL_ART_QVsig_152] = ARTL_ART_QVsig;
    artSlotInstanceOfs[ARTL_ART_QVsig_152] = ARTL_ART_STRING_SQ;
    artKindOfs[ARTL_ART_QVsig_152] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QVsig_152] = true;
    arteoR_pL[ARTL_ART_QVsig_152] = true;
    artPopD[ARTL_ART_QVsig_152] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_156] = "QVsig ::= . '#'  ";
    artLabelStrings[ARTL_ART_QVsig_156] = "";
    artlhsL[ARTL_ART_QVsig_156] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_156] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_QVsig_156] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_157] = "QVsig ::= '#'  ";
    artLabelStrings[ARTL_ART_QVsig_157] = "";
    artlhsL[ARTL_ART_QVsig_157] = ARTL_ART_QVsig;
    artPopD[ARTL_ART_QVsig_157] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_158] = "QVsig ::= '#'  .";
    artLabelStrings[ARTL_ART_QVsig_158] = "";
    artlhsL[ARTL_ART_QVsig_158] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_158] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QVsig_158] = true;
    arteoR_pL[ARTL_ART_QVsig_158] = true;
    artPopD[ARTL_ART_QVsig_158] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_162] = "QVsig ::= . '('  QV '?'  QV ')'  ";
    artLabelStrings[ARTL_ART_QVsig_162] = "";
    artlhsL[ARTL_ART_QVsig_162] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_162] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVsig_163] = "QVsig ::= '('  QV '?'  QV ')'  ";
    artLabelStrings[ARTL_ART_QVsig_163] = "";
    artlhsL[ARTL_ART_QVsig_163] = ARTL_ART_QVsig;
    artLabelInternalStrings[ARTL_ART_QVsig_164] = "QVsig ::= '('  . QV '?'  QV ')'  ";
    artLabelStrings[ARTL_ART_QVsig_164] = "";
    artlhsL[ARTL_ART_QVsig_164] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_164] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_QVsig_164] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_166] = "QVsig ::= '('  QV . '?'  QV ')'  ";
    artLabelStrings[ARTL_ART_QVsig_166] = "";
    artlhsL[ARTL_ART_QVsig_166] = ARTL_ART_QVsig;
    artSlotInstanceOfs[ARTL_ART_QVsig_166] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_QVsig_166] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVsig_167] = "QVsig ::= '('  QV '?'  QV ')'  ";
    artLabelStrings[ARTL_ART_QVsig_167] = "";
    artlhsL[ARTL_ART_QVsig_167] = ARTL_ART_QVsig;
    artLabelInternalStrings[ARTL_ART_QVsig_168] = "QVsig ::= '('  QV '?'  . QV ')'  ";
    artLabelStrings[ARTL_ART_QVsig_168] = "";
    artlhsL[ARTL_ART_QVsig_168] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_168] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_QVsig_170] = "QVsig ::= '('  QV '?'  QV . ')'  ";
    artLabelStrings[ARTL_ART_QVsig_170] = "";
    artlhsL[ARTL_ART_QVsig_170] = ARTL_ART_QVsig;
    artSlotInstanceOfs[ARTL_ART_QVsig_170] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_QVsig_170] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_QVsig_170] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_171] = "QVsig ::= '('  QV '?'  QV ')'  ";
    artLabelStrings[ARTL_ART_QVsig_171] = "";
    artlhsL[ARTL_ART_QVsig_171] = ARTL_ART_QVsig;
    artPopD[ARTL_ART_QVsig_171] = true;
    artLabelInternalStrings[ARTL_ART_QVsig_172] = "QVsig ::= '('  QV '?'  QV ')'  .";
    artLabelStrings[ARTL_ART_QVsig_172] = "";
    artlhsL[ARTL_ART_QVsig_172] = ARTL_ART_QVsig;
    artKindOfs[ARTL_ART_QVsig_172] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_QVsig_172] = true;
    arteoR_pL[ARTL_ART_QVsig_172] = true;
    artPopD[ARTL_ART_QVsig_172] = true;
  }

  public void artTableInitialiser_ART_RAG() {
    artLabelInternalStrings[ARTL_ART_RAG] = "RAG";
    artLabelStrings[ARTL_ART_RAG] = "RAG";
    artKindOfs[ARTL_ART_RAG] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAG_30] = "RAG ::= . RAGrule ";
    artLabelStrings[ARTL_ART_RAG_30] = "";
    artlhsL[ARTL_ART_RAG_30] = ARTL_ART_RAG;
    artKindOfs[ARTL_ART_RAG_30] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAG_32] = "RAG ::= RAGrule .";
    artLabelStrings[ARTL_ART_RAG_32] = "";
    artlhsL[ARTL_ART_RAG_32] = ARTL_ART_RAG;
    artSlotInstanceOfs[ARTL_ART_RAG_32] = ARTL_ART_RAGrule;
    artKindOfs[ARTL_ART_RAG_32] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAG_32] = true;
    arteoR_pL[ARTL_ART_RAG_32] = true;
    artPopD[ARTL_ART_RAG_32] = true;
    artLabelInternalStrings[ARTL_ART_RAG_36] = "RAG ::= . RAGrule RAG ";
    artLabelStrings[ARTL_ART_RAG_36] = "";
    artlhsL[ARTL_ART_RAG_36] = ARTL_ART_RAG;
    artKindOfs[ARTL_ART_RAG_36] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAG_38] = "RAG ::= RAGrule . RAG ";
    artLabelStrings[ARTL_ART_RAG_38] = "";
    artlhsL[ARTL_ART_RAG_38] = ARTL_ART_RAG;
    artSlotInstanceOfs[ARTL_ART_RAG_38] = ARTL_ART_RAGrule;
    artKindOfs[ARTL_ART_RAG_38] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAG_38] = true;
    artLabelInternalStrings[ARTL_ART_RAG_40] = "RAG ::= RAGrule RAG .";
    artLabelStrings[ARTL_ART_RAG_40] = "";
    artlhsL[ARTL_ART_RAG_40] = ARTL_ART_RAG;
    artSlotInstanceOfs[ARTL_ART_RAG_40] = ARTL_ART_RAG;
    artKindOfs[ARTL_ART_RAG_40] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAG_40] = true;
    arteoR_pL[ARTL_ART_RAG_40] = true;
    artPopD[ARTL_ART_RAG_40] = true;
  }

  public void artTableInitialiser_ART_RAGIDList() {
    artLabelInternalStrings[ARTL_ART_RAGIDList] = "RAGIDList";
    artLabelStrings[ARTL_ART_RAGIDList] = "RAGIDList";
    artKindOfs[ARTL_ART_RAGIDList] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGIDList_352] = "RAGIDList ::= . '&'  ID ";
    artLabelStrings[ARTL_ART_RAGIDList_352] = "";
    artlhsL[ARTL_ART_RAGIDList_352] = ARTL_ART_RAGIDList;
    artKindOfs[ARTL_ART_RAGIDList_352] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGIDList_355] = "RAGIDList ::= '&'  ID ";
    artLabelStrings[ARTL_ART_RAGIDList_355] = "";
    artlhsL[ARTL_ART_RAGIDList_355] = ARTL_ART_RAGIDList;
    artLabelInternalStrings[ARTL_ART_RAGIDList_356] = "RAGIDList ::= '&'  . ID ";
    artLabelStrings[ARTL_ART_RAGIDList_356] = "";
    artlhsL[ARTL_ART_RAGIDList_356] = ARTL_ART_RAGIDList;
    artKindOfs[ARTL_ART_RAGIDList_356] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGIDList_356] = true;
    artLabelInternalStrings[ARTL_ART_RAGIDList_358] = "RAGIDList ::= '&'  ID .";
    artLabelStrings[ARTL_ART_RAGIDList_358] = "";
    artlhsL[ARTL_ART_RAGIDList_358] = ARTL_ART_RAGIDList;
    artSlotInstanceOfs[ARTL_ART_RAGIDList_358] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_RAGIDList_358] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGIDList_358] = true;
    arteoR_pL[ARTL_ART_RAGIDList_358] = true;
    artPopD[ARTL_ART_RAGIDList_358] = true;
    artLabelInternalStrings[ARTL_ART_RAGIDList_362] = "RAGIDList ::= . '&'  ID ','  RAGIDList ";
    artLabelStrings[ARTL_ART_RAGIDList_362] = "";
    artlhsL[ARTL_ART_RAGIDList_362] = ARTL_ART_RAGIDList;
    artKindOfs[ARTL_ART_RAGIDList_362] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGIDList_365] = "RAGIDList ::= '&'  ID ','  RAGIDList ";
    artLabelStrings[ARTL_ART_RAGIDList_365] = "";
    artlhsL[ARTL_ART_RAGIDList_365] = ARTL_ART_RAGIDList;
    artLabelInternalStrings[ARTL_ART_RAGIDList_366] = "RAGIDList ::= '&'  . ID ','  RAGIDList ";
    artLabelStrings[ARTL_ART_RAGIDList_366] = "";
    artlhsL[ARTL_ART_RAGIDList_366] = ARTL_ART_RAGIDList;
    artKindOfs[ARTL_ART_RAGIDList_366] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGIDList_366] = true;
    artLabelInternalStrings[ARTL_ART_RAGIDList_368] = "RAGIDList ::= '&'  ID . ','  RAGIDList ";
    artLabelStrings[ARTL_ART_RAGIDList_368] = "";
    artlhsL[ARTL_ART_RAGIDList_368] = ARTL_ART_RAGIDList;
    artSlotInstanceOfs[ARTL_ART_RAGIDList_368] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_RAGIDList_368] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGIDList_369] = "RAGIDList ::= '&'  ID ','  RAGIDList ";
    artLabelStrings[ARTL_ART_RAGIDList_369] = "";
    artlhsL[ARTL_ART_RAGIDList_369] = ARTL_ART_RAGIDList;
    artLabelInternalStrings[ARTL_ART_RAGIDList_370] = "RAGIDList ::= '&'  ID ','  . RAGIDList ";
    artLabelStrings[ARTL_ART_RAGIDList_370] = "";
    artlhsL[ARTL_ART_RAGIDList_370] = ARTL_ART_RAGIDList;
    artKindOfs[ARTL_ART_RAGIDList_370] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGIDList_372] = "RAGIDList ::= '&'  ID ','  RAGIDList .";
    artLabelStrings[ARTL_ART_RAGIDList_372] = "";
    artlhsL[ARTL_ART_RAGIDList_372] = ARTL_ART_RAGIDList;
    artSlotInstanceOfs[ARTL_ART_RAGIDList_372] = ARTL_ART_RAGIDList;
    artKindOfs[ARTL_ART_RAGIDList_372] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGIDList_372] = true;
    arteoR_pL[ARTL_ART_RAGIDList_372] = true;
    artPopD[ARTL_ART_RAGIDList_372] = true;
  }

  public void artTableInitialiser_ART_RAGRangeCond() {
    artLabelInternalStrings[ARTL_ART_RAGRangeCond] = "RAGRangeCond";
    artLabelStrings[ARTL_ART_RAGRangeCond] = "RAGRangeCond";
    artKindOfs[ARTL_ART_RAGRangeCond] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_376] = "RAGRangeCond ::= . '&'  ID '!='  '&'  ID ";
    artLabelStrings[ARTL_ART_RAGRangeCond_376] = "";
    artlhsL[ARTL_ART_RAGRangeCond_376] = ARTL_ART_RAGRangeCond;
    artKindOfs[ARTL_ART_RAGRangeCond_376] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_379] = "RAGRangeCond ::= '&'  ID '!='  '&'  ID ";
    artLabelStrings[ARTL_ART_RAGRangeCond_379] = "";
    artlhsL[ARTL_ART_RAGRangeCond_379] = ARTL_ART_RAGRangeCond;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_380] = "RAGRangeCond ::= '&'  . ID '!='  '&'  ID ";
    artLabelStrings[ARTL_ART_RAGRangeCond_380] = "";
    artlhsL[ARTL_ART_RAGRangeCond_380] = ARTL_ART_RAGRangeCond;
    artKindOfs[ARTL_ART_RAGRangeCond_380] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGRangeCond_380] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_382] = "RAGRangeCond ::= '&'  ID . '!='  '&'  ID ";
    artLabelStrings[ARTL_ART_RAGRangeCond_382] = "";
    artlhsL[ARTL_ART_RAGRangeCond_382] = ARTL_ART_RAGRangeCond;
    artSlotInstanceOfs[ARTL_ART_RAGRangeCond_382] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_RAGRangeCond_382] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_383] = "RAGRangeCond ::= '&'  ID '!='  '&'  ID ";
    artLabelStrings[ARTL_ART_RAGRangeCond_383] = "";
    artlhsL[ARTL_ART_RAGRangeCond_383] = ARTL_ART_RAGRangeCond;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_384] = "RAGRangeCond ::= '&'  ID '!='  . '&'  ID ";
    artLabelStrings[ARTL_ART_RAGRangeCond_384] = "";
    artlhsL[ARTL_ART_RAGRangeCond_384] = ARTL_ART_RAGRangeCond;
    artKindOfs[ARTL_ART_RAGRangeCond_384] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_385] = "RAGRangeCond ::= '&'  ID '!='  '&'  ID ";
    artLabelStrings[ARTL_ART_RAGRangeCond_385] = "";
    artlhsL[ARTL_ART_RAGRangeCond_385] = ARTL_ART_RAGRangeCond;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_386] = "RAGRangeCond ::= '&'  ID '!='  '&'  . ID ";
    artLabelStrings[ARTL_ART_RAGRangeCond_386] = "";
    artlhsL[ARTL_ART_RAGRangeCond_386] = ARTL_ART_RAGRangeCond;
    artKindOfs[ARTL_ART_RAGRangeCond_386] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRangeCond_388] = "RAGRangeCond ::= '&'  ID '!='  '&'  ID .";
    artLabelStrings[ARTL_ART_RAGRangeCond_388] = "";
    artlhsL[ARTL_ART_RAGRangeCond_388] = ARTL_ART_RAGRangeCond;
    artSlotInstanceOfs[ARTL_ART_RAGRangeCond_388] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_RAGRangeCond_388] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRangeCond_388] = true;
    arteoR_pL[ARTL_ART_RAGRangeCond_388] = true;
    artPopD[ARTL_ART_RAGRangeCond_388] = true;
  }

  public void artTableInitialiser_ART_RAGRangeDef() {
    artLabelInternalStrings[ARTL_ART_RAGRangeDef] = "RAGRangeDef";
    artLabelStrings[ARTL_ART_RAGRangeDef] = "RAGRangeDef";
    artKindOfs[ARTL_ART_RAGRangeDef] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGRangeDef_340] = "RAGRangeDef ::= . RAGIDList ':'  RAGRangeSet ";
    artLabelStrings[ARTL_ART_RAGRangeDef_340] = "";
    artlhsL[ARTL_ART_RAGRangeDef_340] = ARTL_ART_RAGRangeDef;
    artKindOfs[ARTL_ART_RAGRangeDef_340] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRangeDef_344] = "RAGRangeDef ::= RAGIDList . ':'  RAGRangeSet ";
    artLabelStrings[ARTL_ART_RAGRangeDef_344] = "";
    artlhsL[ARTL_ART_RAGRangeDef_344] = ARTL_ART_RAGRangeDef;
    artSlotInstanceOfs[ARTL_ART_RAGRangeDef_344] = ARTL_ART_RAGIDList;
    artKindOfs[ARTL_ART_RAGRangeDef_344] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGRangeDef_344] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeDef_345] = "RAGRangeDef ::= RAGIDList ':'  RAGRangeSet ";
    artLabelStrings[ARTL_ART_RAGRangeDef_345] = "";
    artlhsL[ARTL_ART_RAGRangeDef_345] = ARTL_ART_RAGRangeDef;
    artLabelInternalStrings[ARTL_ART_RAGRangeDef_346] = "RAGRangeDef ::= RAGIDList ':'  . RAGRangeSet ";
    artLabelStrings[ARTL_ART_RAGRangeDef_346] = "";
    artlhsL[ARTL_ART_RAGRangeDef_346] = ARTL_ART_RAGRangeDef;
    artKindOfs[ARTL_ART_RAGRangeDef_346] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRangeDef_348] = "RAGRangeDef ::= RAGIDList ':'  RAGRangeSet .";
    artLabelStrings[ARTL_ART_RAGRangeDef_348] = "";
    artlhsL[ARTL_ART_RAGRangeDef_348] = ARTL_ART_RAGRangeDef;
    artSlotInstanceOfs[ARTL_ART_RAGRangeDef_348] = ARTL_ART_RAGRangeSet;
    artKindOfs[ARTL_ART_RAGRangeDef_348] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRangeDef_348] = true;
    arteoR_pL[ARTL_ART_RAGRangeDef_348] = true;
    artPopD[ARTL_ART_RAGRangeDef_348] = true;
  }

  public void artTableInitialiser_ART_RAGRangeExpr() {
    artLabelInternalStrings[ARTL_ART_RAGRangeExpr] = "RAGRangeExpr";
    artLabelStrings[ARTL_ART_RAGRangeExpr] = "RAGRangeExpr";
    artKindOfs[ARTL_ART_RAGRangeExpr] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGRangeExpr_324] = "RAGRangeExpr ::= . RAGRangeDef ";
    artLabelStrings[ARTL_ART_RAGRangeExpr_324] = "";
    artlhsL[ARTL_ART_RAGRangeExpr_324] = ARTL_ART_RAGRangeExpr;
    artKindOfs[ARTL_ART_RAGRangeExpr_324] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRangeExpr_328] = "RAGRangeExpr ::= RAGRangeDef .";
    artLabelStrings[ARTL_ART_RAGRangeExpr_328] = "";
    artlhsL[ARTL_ART_RAGRangeExpr_328] = ARTL_ART_RAGRangeExpr;
    artSlotInstanceOfs[ARTL_ART_RAGRangeExpr_328] = ARTL_ART_RAGRangeDef;
    artKindOfs[ARTL_ART_RAGRangeExpr_328] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRangeExpr_328] = true;
    arteoR_pL[ARTL_ART_RAGRangeExpr_328] = true;
    artPopD[ARTL_ART_RAGRangeExpr_328] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeExpr_332] = "RAGRangeExpr ::= . RAGRangeCond ";
    artLabelStrings[ARTL_ART_RAGRangeExpr_332] = "";
    artlhsL[ARTL_ART_RAGRangeExpr_332] = ARTL_ART_RAGRangeExpr;
    artKindOfs[ARTL_ART_RAGRangeExpr_332] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRangeExpr_336] = "RAGRangeExpr ::= RAGRangeCond .";
    artLabelStrings[ARTL_ART_RAGRangeExpr_336] = "";
    artlhsL[ARTL_ART_RAGRangeExpr_336] = ARTL_ART_RAGRangeExpr;
    artSlotInstanceOfs[ARTL_ART_RAGRangeExpr_336] = ARTL_ART_RAGRangeCond;
    artKindOfs[ARTL_ART_RAGRangeExpr_336] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRangeExpr_336] = true;
    arteoR_pL[ARTL_ART_RAGRangeExpr_336] = true;
    artPopD[ARTL_ART_RAGRangeExpr_336] = true;
  }

  public void artTableInitialiser_ART_RAGRangeSet() {
    artLabelInternalStrings[ARTL_ART_RAGRangeSet] = "RAGRangeSet";
    artLabelStrings[ARTL_ART_RAGRangeSet] = "RAGRangeSet";
    artKindOfs[ARTL_ART_RAGRangeSet] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_392] = "RAGRangeSet ::= . '&LETTER'  ";
    artLabelStrings[ARTL_ART_RAGRangeSet_392] = "";
    artlhsL[ARTL_ART_RAGRangeSet_392] = ARTL_ART_RAGRangeSet;
    artKindOfs[ARTL_ART_RAGRangeSet_392] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_RAGRangeSet_392] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_393] = "RAGRangeSet ::= '&LETTER'  ";
    artLabelStrings[ARTL_ART_RAGRangeSet_393] = "";
    artlhsL[ARTL_ART_RAGRangeSet_393] = ARTL_ART_RAGRangeSet;
    artPopD[ARTL_ART_RAGRangeSet_393] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_394] = "RAGRangeSet ::= '&LETTER'  .";
    artLabelStrings[ARTL_ART_RAGRangeSet_394] = "";
    artlhsL[ARTL_ART_RAGRangeSet_394] = ARTL_ART_RAGRangeSet;
    artKindOfs[ARTL_ART_RAGRangeSet_394] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRangeSet_394] = true;
    arteoR_pL[ARTL_ART_RAGRangeSet_394] = true;
    artPopD[ARTL_ART_RAGRangeSet_394] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_398] = "RAGRangeSet ::= . '&WORD'  ";
    artLabelStrings[ARTL_ART_RAGRangeSet_398] = "";
    artlhsL[ARTL_ART_RAGRangeSet_398] = ARTL_ART_RAGRangeSet;
    artKindOfs[ARTL_ART_RAGRangeSet_398] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_RAGRangeSet_398] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_399] = "RAGRangeSet ::= '&WORD'  ";
    artLabelStrings[ARTL_ART_RAGRangeSet_399] = "";
    artlhsL[ARTL_ART_RAGRangeSet_399] = ARTL_ART_RAGRangeSet;
    artPopD[ARTL_ART_RAGRangeSet_399] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_400] = "RAGRangeSet ::= '&WORD'  .";
    artLabelStrings[ARTL_ART_RAGRangeSet_400] = "";
    artlhsL[ARTL_ART_RAGRangeSet_400] = ARTL_ART_RAGRangeSet;
    artKindOfs[ARTL_ART_RAGRangeSet_400] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRangeSet_400] = true;
    arteoR_pL[ARTL_ART_RAGRangeSet_400] = true;
    artPopD[ARTL_ART_RAGRangeSet_400] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_404] = "RAGRangeSet ::= . '&ANSWER'  ";
    artLabelStrings[ARTL_ART_RAGRangeSet_404] = "";
    artlhsL[ARTL_ART_RAGRangeSet_404] = ARTL_ART_RAGRangeSet;
    artKindOfs[ARTL_ART_RAGRangeSet_404] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_RAGRangeSet_404] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_405] = "RAGRangeSet ::= '&ANSWER'  ";
    artLabelStrings[ARTL_ART_RAGRangeSet_405] = "";
    artlhsL[ARTL_ART_RAGRangeSet_405] = ARTL_ART_RAGRangeSet;
    artPopD[ARTL_ART_RAGRangeSet_405] = true;
    artLabelInternalStrings[ARTL_ART_RAGRangeSet_406] = "RAGRangeSet ::= '&ANSWER'  .";
    artLabelStrings[ARTL_ART_RAGRangeSet_406] = "";
    artlhsL[ARTL_ART_RAGRangeSet_406] = ARTL_ART_RAGRangeSet;
    artKindOfs[ARTL_ART_RAGRangeSet_406] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRangeSet_406] = true;
    arteoR_pL[ARTL_ART_RAGRangeSet_406] = true;
    artPopD[ARTL_ART_RAGRangeSet_406] = true;
  }

  public void artTableInitialiser_ART_RAGRanges() {
    artLabelInternalStrings[ARTL_ART_RAGRanges] = "RAGRanges";
    artLabelStrings[ARTL_ART_RAGRanges] = "RAGRanges";
    artKindOfs[ARTL_ART_RAGRanges] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGRanges_306] = "RAGRanges ::= . # ";
    artLabelStrings[ARTL_ART_RAGRanges_306] = "";
    artlhsL[ARTL_ART_RAGRanges_306] = ARTL_ART_RAGRanges;
    artKindOfs[ARTL_ART_RAGRanges_306] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_RAGRanges_306] = true;
    artLabelInternalStrings[ARTL_ART_RAGRanges_310] = "RAGRanges ::= # .";
    artLabelStrings[ARTL_ART_RAGRanges_310] = "";
    artlhsL[ARTL_ART_RAGRanges_310] = ARTL_ART_RAGRanges;
    artKindOfs[ARTL_ART_RAGRanges_310] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRanges_310] = true;
    arteoR_pL[ARTL_ART_RAGRanges_310] = true;
    artPopD[ARTL_ART_RAGRanges_310] = true;
    artLabelInternalStrings[ARTL_ART_RAGRanges_312] = "RAGRanges ::= . RAGRangeExpr ';'  RAGRanges ";
    artLabelStrings[ARTL_ART_RAGRanges_312] = "";
    artlhsL[ARTL_ART_RAGRanges_312] = ARTL_ART_RAGRanges;
    artKindOfs[ARTL_ART_RAGRanges_312] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRanges_316] = "RAGRanges ::= RAGRangeExpr . ';'  RAGRanges ";
    artLabelStrings[ARTL_ART_RAGRanges_316] = "";
    artlhsL[ARTL_ART_RAGRanges_316] = ARTL_ART_RAGRanges;
    artSlotInstanceOfs[ARTL_ART_RAGRanges_316] = ARTL_ART_RAGRangeExpr;
    artKindOfs[ARTL_ART_RAGRanges_316] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGRanges_316] = true;
    artLabelInternalStrings[ARTL_ART_RAGRanges_317] = "RAGRanges ::= RAGRangeExpr ';'  RAGRanges ";
    artLabelStrings[ARTL_ART_RAGRanges_317] = "";
    artlhsL[ARTL_ART_RAGRanges_317] = ARTL_ART_RAGRanges;
    artLabelInternalStrings[ARTL_ART_RAGRanges_318] = "RAGRanges ::= RAGRangeExpr ';'  . RAGRanges ";
    artLabelStrings[ARTL_ART_RAGRanges_318] = "";
    artlhsL[ARTL_ART_RAGRanges_318] = ARTL_ART_RAGRanges;
    artKindOfs[ARTL_ART_RAGRanges_318] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGRanges_320] = "RAGRanges ::= RAGRangeExpr ';'  RAGRanges .";
    artLabelStrings[ARTL_ART_RAGRanges_320] = "";
    artlhsL[ARTL_ART_RAGRanges_320] = ARTL_ART_RAGRanges;
    artSlotInstanceOfs[ARTL_ART_RAGRanges_320] = ARTL_ART_RAGRanges;
    artKindOfs[ARTL_ART_RAGRanges_320] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGRanges_320] = true;
    arteoR_pL[ARTL_ART_RAGRanges_320] = true;
    artPopD[ARTL_ART_RAGRanges_320] = true;
  }

  public void artTableInitialiser_ART_RAGname() {
    artLabelInternalStrings[ARTL_ART_RAGname] = "RAGname";
    artLabelStrings[ARTL_ART_RAGname] = "RAGname";
    artKindOfs[ARTL_ART_RAGname] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGname_14] = "RAGname ::= . 'Name:'  ID ";
    artLabelStrings[ARTL_ART_RAGname_14] = "";
    artlhsL[ARTL_ART_RAGname_14] = ARTL_ART_RAGname;
    artKindOfs[ARTL_ART_RAGname_14] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGname_15] = "RAGname ::= 'Name:'  ID ";
    artLabelStrings[ARTL_ART_RAGname_15] = "";
    artlhsL[ARTL_ART_RAGname_15] = ARTL_ART_RAGname;
    artLabelInternalStrings[ARTL_ART_RAGname_16] = "RAGname ::= 'Name:'  . ID ";
    artLabelStrings[ARTL_ART_RAGname_16] = "";
    artlhsL[ARTL_ART_RAGname_16] = ARTL_ART_RAGname;
    artKindOfs[ARTL_ART_RAGname_16] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGname_16] = true;
    artLabelInternalStrings[ARTL_ART_RAGname_18] = "RAGname ::= 'Name:'  ID .";
    artLabelStrings[ARTL_ART_RAGname_18] = "";
    artlhsL[ARTL_ART_RAGname_18] = ARTL_ART_RAGname;
    artSlotInstanceOfs[ARTL_ART_RAGname_18] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_RAGname_18] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGname_18] = true;
    arteoR_pL[ARTL_ART_RAGname_18] = true;
    artPopD[ARTL_ART_RAGname_18] = true;
  }

  public void artTableInitialiser_ART_RAGrhs() {
    artLabelInternalStrings[ARTL_ART_RAGrhs] = "RAGrhs";
    artLabelStrings[ARTL_ART_RAGrhs] = "RAGrhs";
    artKindOfs[ARTL_ART_RAGrhs] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGrhs_236] = "RAGrhs ::= . AVsig ";
    artLabelStrings[ARTL_ART_RAGrhs_236] = "";
    artlhsL[ARTL_ART_RAGrhs_236] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_236] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_238] = "RAGrhs ::= AVsig .";
    artLabelStrings[ARTL_ART_RAGrhs_238] = "";
    artlhsL[ARTL_ART_RAGrhs_238] = ARTL_ART_RAGrhs;
    artSlotInstanceOfs[ARTL_ART_RAGrhs_238] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_RAGrhs_238] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGrhs_238] = true;
    arteoR_pL[ARTL_ART_RAGrhs_238] = true;
    artPopD[ARTL_ART_RAGrhs_238] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_242] = "RAGrhs ::= . '<'  QV ','  '&'  ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_242] = "";
    artlhsL[ARTL_ART_RAGrhs_242] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_242] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_245] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_245] = "";
    artlhsL[ARTL_ART_RAGrhs_245] = ARTL_ART_RAGrhs;
    artLabelInternalStrings[ARTL_ART_RAGrhs_246] = "RAGrhs ::= '<'  . QV ','  '&'  ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_246] = "";
    artlhsL[ARTL_ART_RAGrhs_246] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_246] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGrhs_246] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_248] = "RAGrhs ::= '<'  QV . ','  '&'  ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_248] = "";
    artlhsL[ARTL_ART_RAGrhs_248] = ARTL_ART_RAGrhs;
    artSlotInstanceOfs[ARTL_ART_RAGrhs_248] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_RAGrhs_248] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_249] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_249] = "";
    artlhsL[ARTL_ART_RAGrhs_249] = ARTL_ART_RAGrhs;
    artLabelInternalStrings[ARTL_ART_RAGrhs_250] = "RAGrhs ::= '<'  QV ','  . '&'  ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_250] = "";
    artlhsL[ARTL_ART_RAGrhs_250] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_250] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_251] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_251] = "";
    artlhsL[ARTL_ART_RAGrhs_251] = ARTL_ART_RAGrhs;
    artLabelInternalStrings[ARTL_ART_RAGrhs_252] = "RAGrhs ::= '<'  QV ','  '&'  . ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_252] = "";
    artlhsL[ARTL_ART_RAGrhs_252] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_252] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_254] = "RAGrhs ::= '<'  QV ','  '&'  ID . '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_254] = "";
    artlhsL[ARTL_ART_RAGrhs_254] = ARTL_ART_RAGrhs;
    artSlotInstanceOfs[ARTL_ART_RAGrhs_254] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_RAGrhs_254] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_RAGrhs_254] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_255] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  ";
    artLabelStrings[ARTL_ART_RAGrhs_255] = "";
    artlhsL[ARTL_ART_RAGrhs_255] = ARTL_ART_RAGrhs;
    artPopD[ARTL_ART_RAGrhs_255] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_256] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  .";
    artLabelStrings[ARTL_ART_RAGrhs_256] = "";
    artlhsL[ARTL_ART_RAGrhs_256] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_256] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGrhs_256] = true;
    arteoR_pL[ARTL_ART_RAGrhs_256] = true;
    artPopD[ARTL_ART_RAGrhs_256] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_260] = "RAGrhs ::= . AVsig RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_260] = "";
    artlhsL[ARTL_ART_RAGrhs_260] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_260] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_262] = "RAGrhs ::= AVsig . RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_262] = "";
    artlhsL[ARTL_ART_RAGrhs_262] = ARTL_ART_RAGrhs;
    artSlotInstanceOfs[ARTL_ART_RAGrhs_262] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_RAGrhs_262] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGrhs_262] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_264] = "RAGrhs ::= AVsig RAGrhs .";
    artLabelStrings[ARTL_ART_RAGrhs_264] = "";
    artlhsL[ARTL_ART_RAGrhs_264] = ARTL_ART_RAGrhs;
    artSlotInstanceOfs[ARTL_ART_RAGrhs_264] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_264] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGrhs_264] = true;
    arteoR_pL[ARTL_ART_RAGrhs_264] = true;
    artPopD[ARTL_ART_RAGrhs_264] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_268] = "RAGrhs ::= . '<'  QV ','  '&'  ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_268] = "";
    artlhsL[ARTL_ART_RAGrhs_268] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_268] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_271] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_271] = "";
    artlhsL[ARTL_ART_RAGrhs_271] = ARTL_ART_RAGrhs;
    artLabelInternalStrings[ARTL_ART_RAGrhs_272] = "RAGrhs ::= '<'  . QV ','  '&'  ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_272] = "";
    artlhsL[ARTL_ART_RAGrhs_272] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_272] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGrhs_272] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_274] = "RAGrhs ::= '<'  QV . ','  '&'  ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_274] = "";
    artlhsL[ARTL_ART_RAGrhs_274] = ARTL_ART_RAGrhs;
    artSlotInstanceOfs[ARTL_ART_RAGrhs_274] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_RAGrhs_274] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_275] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_275] = "";
    artlhsL[ARTL_ART_RAGrhs_275] = ARTL_ART_RAGrhs;
    artLabelInternalStrings[ARTL_ART_RAGrhs_276] = "RAGrhs ::= '<'  QV ','  . '&'  ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_276] = "";
    artlhsL[ARTL_ART_RAGrhs_276] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_276] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_277] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_277] = "";
    artlhsL[ARTL_ART_RAGrhs_277] = ARTL_ART_RAGrhs;
    artLabelInternalStrings[ARTL_ART_RAGrhs_278] = "RAGrhs ::= '<'  QV ','  '&'  . ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_278] = "";
    artlhsL[ARTL_ART_RAGrhs_278] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_278] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_280] = "RAGrhs ::= '<'  QV ','  '&'  ID . '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_280] = "";
    artlhsL[ARTL_ART_RAGrhs_280] = ARTL_ART_RAGrhs;
    artSlotInstanceOfs[ARTL_ART_RAGrhs_280] = ARTL_ART_ID;
    artKindOfs[ARTL_ART_RAGrhs_280] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_281] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_281] = "";
    artlhsL[ARTL_ART_RAGrhs_281] = ARTL_ART_RAGrhs;
    artLabelInternalStrings[ARTL_ART_RAGrhs_282] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  . RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrhs_282] = "";
    artlhsL[ARTL_ART_RAGrhs_282] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_282] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrhs_284] = "RAGrhs ::= '<'  QV ','  '&'  ID '>'  RAGrhs .";
    artLabelStrings[ARTL_ART_RAGrhs_284] = "";
    artlhsL[ARTL_ART_RAGrhs_284] = ARTL_ART_RAGrhs;
    artSlotInstanceOfs[ARTL_ART_RAGrhs_284] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_284] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGrhs_284] = true;
    arteoR_pL[ARTL_ART_RAGrhs_284] = true;
    artPopD[ARTL_ART_RAGrhs_284] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_288] = "RAGrhs ::= . '{}'  ";
    artLabelStrings[ARTL_ART_RAGrhs_288] = "";
    artlhsL[ARTL_ART_RAGrhs_288] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_288] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_RAGrhs_288] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_289] = "RAGrhs ::= '{}'  ";
    artLabelStrings[ARTL_ART_RAGrhs_289] = "";
    artlhsL[ARTL_ART_RAGrhs_289] = ARTL_ART_RAGrhs;
    artPopD[ARTL_ART_RAGrhs_289] = true;
    artLabelInternalStrings[ARTL_ART_RAGrhs_290] = "RAGrhs ::= '{}'  .";
    artLabelStrings[ARTL_ART_RAGrhs_290] = "";
    artlhsL[ARTL_ART_RAGrhs_290] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrhs_290] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGrhs_290] = true;
    arteoR_pL[ARTL_ART_RAGrhs_290] = true;
    artPopD[ARTL_ART_RAGrhs_290] = true;
  }

  public void artTableInitialiser_ART_RAGrule() {
    artLabelInternalStrings[ARTL_ART_RAGrule] = "RAGrule";
    artLabelStrings[ARTL_ART_RAGrule] = "RAGrule";
    artKindOfs[ARTL_ART_RAGrule] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGrule_214] = "RAGrule ::= . RAGRanges '<'  AVsig ','  QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_214] = "";
    artlhsL[ARTL_ART_RAGrule_214] = ARTL_ART_RAGrule;
    artKindOfs[ARTL_ART_RAGrule_214] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrule_218] = "RAGrule ::= RAGRanges . '<'  AVsig ','  QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_218] = "";
    artlhsL[ARTL_ART_RAGrule_218] = ARTL_ART_RAGrule;
    artSlotInstanceOfs[ARTL_ART_RAGrule_218] = ARTL_ART_RAGRanges;
    artKindOfs[ARTL_ART_RAGrule_218] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGrule_218] = true;
    artLabelInternalStrings[ARTL_ART_RAGrule_219] = "RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_219] = "";
    artlhsL[ARTL_ART_RAGrule_219] = ARTL_ART_RAGrule;
    artLabelInternalStrings[ARTL_ART_RAGrule_220] = "RAGrule ::= RAGRanges '<'  . AVsig ','  QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_220] = "";
    artlhsL[ARTL_ART_RAGrule_220] = ARTL_ART_RAGrule;
    artKindOfs[ARTL_ART_RAGrule_220] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrule_222] = "RAGrule ::= RAGRanges '<'  AVsig . ','  QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_222] = "";
    artlhsL[ARTL_ART_RAGrule_222] = ARTL_ART_RAGrule;
    artSlotInstanceOfs[ARTL_ART_RAGrule_222] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_RAGrule_222] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrule_223] = "RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_223] = "";
    artlhsL[ARTL_ART_RAGrule_223] = ARTL_ART_RAGrule;
    artLabelInternalStrings[ARTL_ART_RAGrule_224] = "RAGrule ::= RAGRanges '<'  AVsig ','  . QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_224] = "";
    artlhsL[ARTL_ART_RAGrule_224] = ARTL_ART_RAGrule;
    artKindOfs[ARTL_ART_RAGrule_224] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrule_226] = "RAGrule ::= RAGRanges '<'  AVsig ','  QV . '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_226] = "";
    artlhsL[ARTL_ART_RAGrule_226] = ARTL_ART_RAGrule;
    artSlotInstanceOfs[ARTL_ART_RAGrule_226] = ARTL_ART_QV;
    artKindOfs[ARTL_ART_RAGrule_226] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrule_227] = "RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_227] = "";
    artlhsL[ARTL_ART_RAGrule_227] = ARTL_ART_RAGrule;
    artLabelInternalStrings[ARTL_ART_RAGrule_228] = "RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  . '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_228] = "";
    artlhsL[ARTL_ART_RAGrule_228] = ARTL_ART_RAGrule;
    artKindOfs[ARTL_ART_RAGrule_228] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrule_229] = "RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  '->'  RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_229] = "";
    artlhsL[ARTL_ART_RAGrule_229] = ARTL_ART_RAGrule;
    artLabelInternalStrings[ARTL_ART_RAGrule_230] = "RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  '->'  . RAGrhs ";
    artLabelStrings[ARTL_ART_RAGrule_230] = "";
    artlhsL[ARTL_ART_RAGrule_230] = ARTL_ART_RAGrule;
    artKindOfs[ARTL_ART_RAGrule_230] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGrule_232] = "RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  '->'  RAGrhs .";
    artLabelStrings[ARTL_ART_RAGrule_232] = "";
    artlhsL[ARTL_ART_RAGrule_232] = ARTL_ART_RAGrule;
    artSlotInstanceOfs[ARTL_ART_RAGrule_232] = ARTL_ART_RAGrhs;
    artKindOfs[ARTL_ART_RAGrule_232] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGrule_232] = true;
    arteoR_pL[ARTL_ART_RAGrule_232] = true;
    artPopD[ARTL_ART_RAGrule_232] = true;
  }

  public void artTableInitialiser_ART_RAGstartsymbol() {
    artLabelInternalStrings[ARTL_ART_RAGstartsymbol] = "RAGstartsymbol";
    artLabelStrings[ARTL_ART_RAGstartsymbol] = "RAGstartsymbol";
    artKindOfs[ARTL_ART_RAGstartsymbol] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_RAGstartsymbol_22] = "RAGstartsymbol ::= . 'Start:'  AVsig ";
    artLabelStrings[ARTL_ART_RAGstartsymbol_22] = "";
    artlhsL[ARTL_ART_RAGstartsymbol_22] = ARTL_ART_RAGstartsymbol;
    artKindOfs[ARTL_ART_RAGstartsymbol_22] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_RAGstartsymbol_23] = "RAGstartsymbol ::= 'Start:'  AVsig ";
    artLabelStrings[ARTL_ART_RAGstartsymbol_23] = "";
    artlhsL[ARTL_ART_RAGstartsymbol_23] = ARTL_ART_RAGstartsymbol;
    artLabelInternalStrings[ARTL_ART_RAGstartsymbol_24] = "RAGstartsymbol ::= 'Start:'  . AVsig ";
    artLabelStrings[ARTL_ART_RAGstartsymbol_24] = "";
    artlhsL[ARTL_ART_RAGstartsymbol_24] = ARTL_ART_RAGstartsymbol;
    artKindOfs[ARTL_ART_RAGstartsymbol_24] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_RAGstartsymbol_24] = true;
    artLabelInternalStrings[ARTL_ART_RAGstartsymbol_26] = "RAGstartsymbol ::= 'Start:'  AVsig .";
    artLabelStrings[ARTL_ART_RAGstartsymbol_26] = "";
    artlhsL[ARTL_ART_RAGstartsymbol_26] = ARTL_ART_RAGstartsymbol;
    artSlotInstanceOfs[ARTL_ART_RAGstartsymbol_26] = ARTL_ART_AVsig;
    artKindOfs[ARTL_ART_RAGstartsymbol_26] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_RAGstartsymbol_26] = true;
    arteoR_pL[ARTL_ART_RAGstartsymbol_26] = true;
    artPopD[ARTL_ART_RAGstartsymbol_26] = true;
  }

  public void artTableInitialiser_ART_STRING_SQ() {
    artLabelInternalStrings[ARTL_ART_STRING_SQ] = "STRING_SQ";
    artLabelStrings[ARTL_ART_STRING_SQ] = "STRING_SQ";
    artKindOfs[ARTL_ART_STRING_SQ] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_STRING_SQ_300] = "STRING_SQ ::= . &STRING_SQ  ";
    artLabelStrings[ARTL_ART_STRING_SQ_300] = "";
    artlhsL[ARTL_ART_STRING_SQ_300] = ARTL_ART_STRING_SQ;
    artKindOfs[ARTL_ART_STRING_SQ_300] = ARTK_INTERMEDIATE;
    artPopD[ARTL_ART_STRING_SQ_300] = true;
    artLabelInternalStrings[ARTL_ART_STRING_SQ_301] = "STRING_SQ ::= &STRING_SQ  ";
    artLabelStrings[ARTL_ART_STRING_SQ_301] = "";
    artlhsL[ARTL_ART_STRING_SQ_301] = ARTL_ART_STRING_SQ;
    artPopD[ARTL_ART_STRING_SQ_301] = true;
    artLabelInternalStrings[ARTL_ART_STRING_SQ_302] = "STRING_SQ ::= &STRING_SQ  .";
    artLabelStrings[ARTL_ART_STRING_SQ_302] = "";
    artlhsL[ARTL_ART_STRING_SQ_302] = ARTL_ART_STRING_SQ;
    artKindOfs[ARTL_ART_STRING_SQ_302] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_STRING_SQ_302] = true;
    arteoR_pL[ARTL_ART_STRING_SQ_302] = true;
    artPopD[ARTL_ART_STRING_SQ_302] = true;
  }

  public void artTableInitialiser_ART_Start() {
    artLabelInternalStrings[ARTL_ART_Start] = "Start";
    artLabelStrings[ARTL_ART_Start] = "Start";
    artKindOfs[ARTL_ART_Start] = ARTK_NONTERMINAL;
    artLabelInternalStrings[ARTL_ART_Start_2] = "Start ::= . RAGname RAGstartsymbol RAG ";
    artLabelStrings[ARTL_ART_Start_2] = "";
    artlhsL[ARTL_ART_Start_2] = ARTL_ART_Start;
    artKindOfs[ARTL_ART_Start_2] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_Start_6] = "Start ::= RAGname . RAGstartsymbol RAG ";
    artLabelStrings[ARTL_ART_Start_6] = "";
    artlhsL[ARTL_ART_Start_6] = ARTL_ART_Start;
    artSlotInstanceOfs[ARTL_ART_Start_6] = ARTL_ART_RAGname;
    artKindOfs[ARTL_ART_Start_6] = ARTK_INTERMEDIATE;
    artfiRL[ARTL_ART_Start_6] = true;
    artLabelInternalStrings[ARTL_ART_Start_8] = "Start ::= RAGname RAGstartsymbol . RAG ";
    artLabelStrings[ARTL_ART_Start_8] = "";
    artlhsL[ARTL_ART_Start_8] = ARTL_ART_Start;
    artSlotInstanceOfs[ARTL_ART_Start_8] = ARTL_ART_RAGstartsymbol;
    artKindOfs[ARTL_ART_Start_8] = ARTK_INTERMEDIATE;
    artLabelInternalStrings[ARTL_ART_Start_10] = "Start ::= RAGname RAGstartsymbol RAG .";
    artLabelStrings[ARTL_ART_Start_10] = "";
    artlhsL[ARTL_ART_Start_10] = ARTL_ART_Start;
    artSlotInstanceOfs[ARTL_ART_Start_10] = ARTL_ART_RAG;
    artKindOfs[ARTL_ART_Start_10] = ARTK_INTERMEDIATE;
    arteoRL[ARTL_ART_Start_10] = true;
    arteoR_pL[ARTL_ART_Start_10] = true;
    artPopD[ARTL_ART_Start_10] = true;
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

    artLonger = new ARTBitSet[ARTX_LABEL_EXTENT + 1];
    for (int i = 0; i < ARTX_LABEL_EXTENT + 1; i++) artLonger[i] = new ARTBitSet();
    artHigher = new ARTBitSet[ARTX_LABEL_EXTENT + 1];
    for (int i = 0; i < ARTX_LABEL_EXTENT + 1; i++) artHigher[i] = new ARTBitSet();

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
    artLabelStrings[ARTTB_SIMPLE_WHITESPACE] = "SIMPLE_WHITESPACE";
    artLabelInternalStrings[ARTTB_SIMPLE_WHITESPACE] = "&SIMPLE_WHITESPACE";
    artKindOfs[ARTTB_SIMPLE_WHITESPACE] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_SIMPLE_WHITESPACE] = true;
    artLabelStrings[ARTTB_STRING_SQ] = "STRING_SQ";
    artLabelInternalStrings[ARTTB_STRING_SQ] = "&STRING_SQ";
    artKindOfs[ARTTB_STRING_SQ] = ARTK_BUILTIN_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTB_STRING_SQ] = true;
    artLabelStrings[ARTTS__SHREIK_EQUAL] = "!=";
    artLabelInternalStrings[ARTTS__SHREIK_EQUAL] = "'!='";
    artKindOfs[ARTTS__SHREIK_EQUAL] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__SHREIK_EQUAL] = true;
    artLabelStrings[ARTTS__HASH] = "#";
    artLabelInternalStrings[ARTTS__HASH] = "'#'";
    artKindOfs[ARTTS__HASH] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__HASH] = true;
    artLabelStrings[ARTTS__AMPERSAND] = "&";
    artLabelInternalStrings[ARTTS__AMPERSAND] = "'&'";
    artKindOfs[ARTTS__AMPERSAND] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__AMPERSAND] = true;
    artLabelStrings[ARTTS__AMPERSANDANSWER] = "&ANSWER";
    artLabelInternalStrings[ARTTS__AMPERSANDANSWER] = "'&ANSWER'";
    artKindOfs[ARTTS__AMPERSANDANSWER] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__AMPERSANDANSWER] = true;
    artLabelStrings[ARTTS__AMPERSANDLETTER] = "&LETTER";
    artLabelInternalStrings[ARTTS__AMPERSANDLETTER] = "'&LETTER'";
    artKindOfs[ARTTS__AMPERSANDLETTER] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__AMPERSANDLETTER] = true;
    artLabelStrings[ARTTS__AMPERSANDWORD] = "&WORD";
    artLabelInternalStrings[ARTTS__AMPERSANDWORD] = "'&WORD'";
    artKindOfs[ARTTS__AMPERSANDWORD] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__AMPERSANDWORD] = true;
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
    artLabelStrings[ARTTS_Start_COLON] = "Start:";
    artLabelInternalStrings[ARTTS_Start_COLON] = "'Start:'";
    artKindOfs[ARTTS_Start_COLON] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS_Start_COLON] = true;
    artLabelStrings[ARTTS__LBRACK] = "[";
    artLabelInternalStrings[ARTTS__LBRACK] = "'['";
    artKindOfs[ARTTS__LBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACK] = true;
    artLabelStrings[ARTTS__RBRACK] = "]";
    artLabelInternalStrings[ARTTS__RBRACK] = "']'";
    artKindOfs[ARTTS__RBRACK] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__RBRACK] = true;
    artLabelStrings[ARTTS__LBRACE_RBRACE] = "{}";
    artLabelInternalStrings[ARTTS__LBRACE_RBRACE] = "'{}'";
    artKindOfs[ARTTS__LBRACE_RBRACE] = ARTK_CASE_SENSITIVE_TERMINAL;
    artTerminalRequiresWhiteSpace[ARTTS__LBRACE_RBRACE] = true;
    artTableInitialiser_ART_AV();
    artTableInitialiser_ART_AVarglist();
    artTableInitialiser_ART_AVsig();
    artTableInitialiser_ART_ID();
    artTableInitialiser_ART_QV();
    artTableInitialiser_ART_QVlist();
    artTableInitialiser_ART_QVsig();
    artTableInitialiser_ART_RAG();
    artTableInitialiser_ART_RAGIDList();
    artTableInitialiser_ART_RAGRangeCond();
    artTableInitialiser_ART_RAGRangeDef();
    artTableInitialiser_ART_RAGRangeExpr();
    artTableInitialiser_ART_RAGRangeSet();
    artTableInitialiser_ART_RAGRanges();
    artTableInitialiser_ART_RAGname();
    artTableInitialiser_ART_RAGrhs();
    artTableInitialiser_ART_RAGrule();
    artTableInitialiser_ART_RAGstartsymbol();
    artTableInitialiser_ART_STRING_SQ();
    artTableInitialiser_ART_Start();
  }

  public ARTGeneratedParser(ARTLexerV3 artLexer) {
    this(null, artLexer);
  }

  public ARTGeneratedParser(ARTGrammar artGrammar, ARTLexerV3 artLexer) {
    super(artGrammar, artLexer);
    artParserKind = "GLL Gen";
    artFirstTerminalLabel = ARTTS__SHREIK_EQUAL;
    artFirstUnusedLabel = ARTX_LABEL_EXTENT + 1;
    artSetExtent = 45;
    ARTL_EOS = ARTX_EOS;
    ARTL_EPSILON = ARTX_EPSILON;
    ARTL_DUMMY = ARTX_DUMMY;
    artGrammarKind = ARTModeGrammarKind.BNF;
    artDefaultStartSymbolLabel = ARTL_ART_Start;
    artBuildDirectives = "ARTDirectives [verbosityLevel=0, statistics=false, trace=false, inputs=[], inputFilenames=[], lexWSSuffix=false, lexExtents=false, lexSegments=false, lexRecursive=false, lexPrintTWESet=false, lexDead=false, lexLongestWithin=false, lexLongestAcross=false, lexPriority=false, outputDirectory=., parserName=ARTGeneratedParser, lexerName=ARTGeneratedLexer, namespace=null, despatchMode=fragment, supportMode=HashPool, predictivePops=false, FIFODescriptors=false, suppressPopGuard=false, suppressProductionGuard=false, suppressTestRepeat=false, suppressSemantics=false, clusteredGSS=false, algorithmMode=gllGeneratorPool, treeLevel=3]";
    artFIFODescriptors = false;
    artSetInitialise();
    artTableInitialise();
  }

  private ARTGLLRDT artRDT;
  private int artNextFreeNodeNumber = 1;


    BufferedWriter writer;

    String ragName;
    String leftBrace = Character.toString ((char) 123);
    String rightBrace = Character.toString ((char) 125);
    String newLine = Character.toString ((char) 10);
    String quotation = Character.toString ((char) 34);
    String tabOne = Character.toString ((char) 9);
    String tabTwo = tabOne + Character.toString ((char) 9);
    String tabThree = tabTwo + Character.toString ((char) 9);

    HashMap<String, String> answerIDDefinitionMap;
    HashMap<String, String> terminalIDDefinitionMap;
    HashMap<String, Integer> variableIdentifierMap;
    ArrayList<Integer> distinctVarsSeenInArgs;

    int polyCount;
    int polysEverDefinedCount;
    int argsListCount;
    int argsListEverDefinedCount = 1;

    boolean noMoreVars;
    boolean noMoreAnswerID;
    boolean hasEmptySet;


  public static class ARTAT_ART_AV extends ARTGLLAttributeBlock {
    public String polysString;
    public boolean childOfAV;
    public int activePolynomial;
    ARTGLLRDTHandle AV1;
    ARTGLLRDTHandle AVsig1;
    public String toString() {
      String ret = "";
    ret += " polysString=" + polysString;
    ret += " childOfAV=" + childOfAV;
    ret += " activePolynomial=" + activePolynomial;
      return ret + " ";
}
  }

  public static class ARTAT_ART_AVarglist extends ARTGLLAttributeBlock {
    public boolean childOfAVarglist;
    public String argsString;
    public int activeArgsList;
    public int listLength;
    ARTGLLRDTHandle AV1;
    ARTGLLRDTHandle AVarglist1;
    public String toString() {
      String ret = "";
    ret += " childOfAVarglist=" + childOfAVarglist;
    ret += " argsString=" + argsString;
    ret += " activeArgsList=" + activeArgsList;
    ret += " listLength=" + listLength;
      return ret + " ";
}
  }

  public static class ARTAT_ART_AVsig extends ARTGLLAttributeBlock {
    public String answerID;
    public int argsVarCount;
    public int answerType;
    public String answerConstructor;
    public String argsListStatements;
    public int variableID;
    ARTGLLRDTHandle AVarglist1;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle STRING_SQ1;
    public String toString() {
      String ret = "";
    ret += " answerID=" + answerID;
    ret += " argsVarCount=" + argsVarCount;
    ret += " answerType=" + answerType;
    ret += " answerConstructor=" + answerConstructor;
    ret += " argsListStatements=" + argsListStatements;
    ret += " variableID=" + variableID;
      return ret + " ";
}
  }

  public static class ARTAT_ART_ID extends ARTGLLAttributeBlock {
    public String value;
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public int varID;
    public boolean isVar;
    public String toString() {
      String ret = "";
    ret += " value=" + value;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
    ret += " varID=" + varID;
    ret += " isVar=" + isVar;
      return ret + " ";
}
  }

  public static class ARTAT_ART_QV extends ARTGLLAttributeBlock {
    public String polysString;
    public boolean childOfQV;
    public int activePolynomial;
    ARTGLLRDTHandle QV1;
    ARTGLLRDTHandle QVsig1;
    public String toString() {
      String ret = "";
    ret += " polysString=" + polysString;
    ret += " childOfQV=" + childOfQV;
    ret += " activePolynomial=" + activePolynomial;
      return ret + " ";
}
  }

  public static class ARTAT_ART_QVlist extends ARTGLLAttributeBlock {
    public String argsString;
    public boolean childOfQVlist;
    public int activeArgsList;
    public int listLength;
    ARTGLLRDTHandle QV1;
    ARTGLLRDTHandle QVlist1;
    public String toString() {
      String ret = "";
    ret += " argsString=" + argsString;
    ret += " childOfQVlist=" + childOfQVlist;
    ret += " activeArgsList=" + activeArgsList;
    ret += " listLength=" + listLength;
      return ret + " ";
}
  }

  public static class ARTAT_ART_QVsig extends ARTGLLAttributeBlock {
    public String listStatements;
    public String queryConstructor;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle QV1;
    ARTGLLRDTHandle QV2;
    ARTGLLRDTHandle QVlist1;
    ARTGLLRDTHandle STRING_SQ1;
    public String toString() {
      String ret = "";
    ret += " listStatements=" + listStatements;
    ret += " queryConstructor=" + queryConstructor;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAG extends ARTGLLAttributeBlock {
    public String ragRulesString;
    ARTGLLRDTHandle RAG1;
    ARTGLLRDTHandle RAGrule1;
    public String toString() {
      String ret = "";
    ret += " ragRulesString=" + ragRulesString;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGIDList extends ARTGLLAttributeBlock {
    public HashMap variableToTypeMap;
    public ArrayList variableIDList;
    public boolean childOfRAGIDList;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle RAGIDList1;
    public String toString() {
      String ret = "";
    ret += " variableToTypeMap=" + variableToTypeMap;
    ret += " variableIDList=" + variableIDList;
    ret += " childOfRAGIDList=" + childOfRAGIDList;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGRangeCond extends ARTGLLAttributeBlock {
    public HashMap variableToTypeMap;
    public ArrayList variableCondList;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle ID2;
    public String toString() {
      String ret = "";
    ret += " variableToTypeMap=" + variableToTypeMap;
    ret += " variableCondList=" + variableCondList;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGRangeDef extends ARTGLLAttributeBlock {
    public HashMap variableToTypeMap;
    ARTGLLRDTHandle RAGIDList1;
    ARTGLLRDTHandle RAGRangeSet1;
    public String toString() {
      String ret = "";
    ret += " variableToTypeMap=" + variableToTypeMap;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGRangeExpr extends ARTGLLAttributeBlock {
    public HashMap variableToTypeMap;
    public ArrayList variableCondList;
    ARTGLLRDTHandle RAGRangeCond1;
    ARTGLLRDTHandle RAGRangeDef1;
    public String toString() {
      String ret = "";
    ret += " variableToTypeMap=" + variableToTypeMap;
    ret += " variableCondList=" + variableCondList;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGRangeSet extends ARTGLLAttributeBlock {
    public String variableType;
    public String toString() {
      String ret = "";
    ret += " variableType=" + variableType;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGRanges extends ARTGLLAttributeBlock {
    public HashMap variableToTypeMap;
    public boolean childOfRAGRanges;
    public ArrayList variableCondList;
    ARTGLLRDTHandle RAGRangeExpr1;
    ARTGLLRDTHandle RAGRanges1;
    public String toString() {
      String ret = "";
    ret += " variableToTypeMap=" + variableToTypeMap;
    ret += " childOfRAGRanges=" + childOfRAGRanges;
    ret += " variableCondList=" + variableCondList;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGname extends ARTGLLAttributeBlock {
    public String ragName;
    ARTGLLRDTHandle ID1;
    public String toString() {
      String ret = "";
    ret += " ragName=" + ragName;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGrhs extends ARTGLLAttributeBlock {
    public String rhsStatements;
    ARTGLLRDTHandle AVsig1;
    ARTGLLRDTHandle ID1;
    ARTGLLRDTHandle QV1;
    ARTGLLRDTHandle RAGrhs1;
    public String toString() {
      String ret = "";
    ret += " rhsStatements=" + rhsStatements;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGrule extends ARTGLLAttributeBlock {
    public String ruleString;
    public String nonTerminalSymbol;
    ARTGLLRDTHandle AVsig1;
    ARTGLLRDTHandle QV1;
    ARTGLLRDTHandle RAGRanges1;
    ARTGLLRDTHandle RAGrhs1;
    public String toString() {
      String ret = "";
    ret += " ruleString=" + ruleString;
    ret += " nonTerminalSymbol=" + nonTerminalSymbol;
      return ret + " ";
}
  }

  public static class ARTAT_ART_RAGstartsymbol extends ARTGLLAttributeBlock {
    public String ragStartSymbol;
    public String ragStartSymbolStatements;
    public String startSymbolID;
    ARTGLLRDTHandle AVsig1;
    public String toString() {
      String ret = "";
    ret += " ragStartSymbol=" + ragStartSymbol;
    ret += " ragStartSymbolStatements=" + ragStartSymbolStatements;
    ret += " startSymbolID=" + startSymbolID;
      return ret + " ";
}
  }

  public static class ARTAT_ART_STRING_SQ extends ARTGLLAttributeBlock {
    public String value;
    public int rightExtent;
    public int leftExtent;
    public String lexeme;
    public String toString() {
      String ret = "";
    ret += " value=" + value;
    ret += " rightExtent=" + rightExtent;
    ret += " leftExtent=" + leftExtent;
    ret += " lexeme=" + lexeme;
      return ret + " ";
}
  }

  public static class ARTAT_ART_Start extends ARTGLLAttributeBlock {
    ARTGLLRDTHandle RAG1;
    ARTGLLRDTHandle RAGname1;
    ARTGLLRDTHandle RAGstartsymbol1;
    public String toString() {
      String ret = "";
      return ret + " ";
}
  }

  public void ARTRD_AV(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_AV AV, ARTAT_ART_AV AV1, ARTAT_ART_AVsig AVsig1) throws ARTException {
  ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
      /*AV ::= AVsig .*/
      case ARTL_ART_AV_88: 
        AV1 = new ARTAT_ART_AV();
        AVsig1 = new ARTAT_ART_AVsig();
        
            if (!AV.childOfAV) {
                if (++polyCount > polysEverDefinedCount) {
                    AV.polysString = tabTwo + "Polynomial poly" + polyCount;
                    polysEverDefinedCount++;
                } else {
                    AV.polysString = tabTwo + "poly" + polyCount;
                }
                AV.polysString += " = new Polynomial();" + newLine;
                AV.activePolynomial = polyCount;
            } else {
                AV.polysString = "";
            }
        
        ARTRD_AV(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AV, AV1, AVsig1);
        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AVsig1));
        ARTRD_AVsig(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AVsig1, null, null, null);
        
            if (AVsig1.answerType == 2) if (!distinctVarsSeenInArgs.contains(AVsig1.variableID)) distinctVarsSeenInArgs.add(AVsig1.variableID);
            if (AVsig1.argsListStatements != null) AV.polysString += AVsig1.argsListStatements;
            AV.polysString += tabTwo + "poly" + AV.activePolynomial + ".add(" + AVsig1.answerConstructor + ");" + newLine;
        
        break;
      /*AV ::= AVsig AV .*/
      case ARTL_ART_AV_98: 
        AV1 = new ARTAT_ART_AV();
        AVsig1 = new ARTAT_ART_AVsig();
        
            if (!AV.childOfAV) {
                if (++polyCount > polysEverDefinedCount) {
                    AV.polysString = tabTwo + "Polynomial poly" + polyCount;
                    polysEverDefinedCount++;
                } else {
                    AV.polysString = tabTwo + "poly" + polyCount;
                }
                AV.polysString += " = new Polynomial();" + newLine;
                AV.activePolynomial = polyCount;
            } else {
                AV.polysString = "";
            }
            AV1.childOfAV = true;
            AV1.activePolynomial = AV.activePolynomial;
        
        artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), AVsig1));
        ARTRD_AVsig(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, AVsig1, null, null, null);
                artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AV1));
        ARTRD_AV(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AV1, null, null);
        
            if (AVsig1.answerType == 2) if (!distinctVarsSeenInArgs.contains(AVsig1.variableID)) distinctVarsSeenInArgs.add(AVsig1.variableID);
            if (AVsig1.argsListStatements != null) AV.polysString += AVsig1.argsListStatements;
            AV.polysString += tabTwo + "poly" + AV.activePolynomial + ".add(" + AVsig1.answerConstructor + ");" + newLine;
            AV.polysString += AV1.polysString;
        
        break;
        default:
          throw new ARTException("ARTRD_AV: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_AVarglist(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_AVarglist AVarglist, ARTAT_ART_AV AV1, ARTAT_ART_AVarglist AVarglist1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*AVarglist ::= AV .*/
    case ARTL_ART_AVarglist_106: 
      AV1 = new ARTAT_ART_AV();
      AVarglist1 = new ARTAT_ART_AVarglist();
      
            if (!AVarglist.childOfAVarglist) {
                if (++argsListCount > argsListEverDefinedCount) {
                    AVarglist.argsString = tabTwo + "ArrayList<Polynomial> args" + argsListCount + " = new ArrayList<>();" + newLine;
                    argsListEverDefinedCount = argsListCount;
                } else {
                    if (argsListCount != 1) AVarglist.argsString = tabTwo + "args" + argsListCount + " = new ArrayList<>();" + newLine;
                    else AVarglist.argsString = "";
                }
                AVarglist.activeArgsList = argsListCount;
            } else {
                AVarglist.argsString = "";
            }
        
      ARTRD_AVarglist(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AVarglist, AV1, AVarglist1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AV1));
      ARTRD_AV(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AV1, null, null);
      
            AVarglist.argsString += AV1.polysString;
            AVarglist.argsString += tabTwo + "args" + AVarglist.activeArgsList + ".add(poly" + AV1.activePolynomial + ");" + newLine;
            AVarglist.listLength = 1;
        
      break;
    /*AVarglist ::= AV ','  . AVarglist */
    case ARTL_ART_AVarglist_116: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), AV1));
      ARTRD_AV(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, AV1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*AVarglist ::= AV ','  AVarglist .*/
    case ARTL_ART_AVarglist_118: 
      AV1 = new ARTAT_ART_AV();
      AVarglist1 = new ARTAT_ART_AVarglist();
      
            if (!AVarglist.childOfAVarglist) {
                if (++argsListCount > argsListEverDefinedCount) {
                    AVarglist.argsString = tabTwo + "ArrayList<Polynomial> args" + argsListCount + " = new ArrayList<>();" + newLine;
                    argsListEverDefinedCount = argsListCount;
                } else {
                    if (argsListCount != 1) AVarglist.argsString = tabTwo + "args" + argsListCount + " = new ArrayList<>();" + newLine;
                    else AVarglist.argsString = "";
                }
                AVarglist.activeArgsList = argsListCount;
            } else {
                AVarglist.argsString = "";
            }
            AVarglist1.childOfAVarglist = true;
            AVarglist1.activeArgsList = AVarglist.activeArgsList;
        
      ARTRD_AVarglist(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AVarglist, AV1, AVarglist1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AVarglist1));
      ARTRD_AVarglist(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AVarglist1, null, null);
      
            AVarglist.argsString += AV1.polysString;
            AVarglist.argsString += tabTwo + "args" + AVarglist.activeArgsList + ".add(poly" + AV1.activePolynomial + ");" + newLine;
            AVarglist.argsString += AVarglist1.argsString;
            AVarglist.listLength = 1 + AVarglist1.listLength;
        
      break;
        default:
          throw new ARTException("ARTRD_AVarglist: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_AVsig(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_AVsig AVsig, ARTAT_ART_AVarglist AVarglist1, ARTAT_ART_ID ID1, ARTAT_ART_STRING_SQ STRING_SQ1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*AVsig ::= ID .*/
    case ARTL_ART_AVsig_46: 
      AVarglist1 = new ARTAT_ART_AVarglist();
      ID1 = new ARTAT_ART_ID();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_AVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AVsig, AVarglist1, ID1, STRING_SQ1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      
            AVsig.answerType = 1;
            if (!answerIDDefinitionMap.containsKey(ID1.value + "/0") && !noMoreAnswerID) answerIDDefinitionMap.put(ID1.value + "/0", "nt_answer_" + ID1.value + "_0");
            AVsig.answerID = answerIDDefinitionMap.get(ID1.value + "/0");
            AVsig.answerConstructor = "new Answer(" + AVsig.answerID + ")";
        
      break;
    /*AVsig ::= '&'  ID .*/
    case ARTL_ART_AVsig_56: 
      AVarglist1 = new ARTAT_ART_AVarglist();
      ID1 = new ARTAT_ART_ID();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
      
            ID1.isVar = true;
        
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      
            AVsig.answerType = 2;
            AVsig.answerConstructor = "vars.get(" + ID1.varID + ")";
            AVsig.variableID = ID1.varID;
        
      break;
    /*AVsig ::= ID '['  . AVarglist ']'  */
    case ARTL_ART_AVsig_64: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*AVsig ::= ID '['  AVarglist . ']'  */
    case ARTL_ART_AVsig_66: 
      ARTRD_AVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AVsig, AVarglist1, ID1, STRING_SQ1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AVarglist1));
      ARTRD_AVarglist(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AVarglist1, null, null);
            break;
    /*AVsig ::= ID '['  AVarglist ']'  .*/
    case ARTL_ART_AVsig_68: 
      AVarglist1 = new ARTAT_ART_AVarglist();
      ID1 = new ARTAT_ART_ID();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_AVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AVsig, AVarglist1, ID1, STRING_SQ1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            AVsig.answerType = 3;
            int argsCount = AVarglist1.listLength;
            if (!answerIDDefinitionMap.containsKey(ID1.value + "/" + argsCount) && !noMoreAnswerID) answerIDDefinitionMap.put(ID1.value + "/" + argsCount, "nt_answer_" + ID1.value + "_" + argsCount);
            AVsig.answerID = answerIDDefinitionMap.get(ID1.value + "/" + argsCount);
            AVsig.answerConstructor = "new Answer(" + AVsig.answerID + ", " + "args" + AVarglist1.activeArgsList + ")";
            AVsig.argsListStatements = AVarglist1.argsString;
            //AVsig.argsVarCount = 0;
        
      break;
    /*AVsig ::= STRING_SQ .*/
    case ARTL_ART_AVsig_74: 
      AVarglist1 = new ARTAT_ART_AVarglist();
      ID1 = new ARTAT_ART_ID();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_AVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AVsig, AVarglist1, ID1, STRING_SQ1);
      STRING_SQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_SQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_SQ1));
      ARTRD_STRING_SQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_SQ1);
      
            AVsig.answerType = 4;
            if (!terminalIDDefinitionMap.containsKey(STRING_SQ1.value)) terminalIDDefinitionMap.put(STRING_SQ1.value, "tl_answer_" + terminalIDDefinitionMap.size());
            AVsig.answerConstructor = "new Answer(" + terminalIDDefinitionMap.get(STRING_SQ1.value) + ")";
        
      break;
    /*AVsig ::= '#'  .*/
    case ARTL_ART_AVsig_80: 
      AVarglist1 = new ARTAT_ART_AVarglist();
      ID1 = new ARTAT_ART_ID();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_AVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, AVsig, AVarglist1, ID1, STRING_SQ1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            AVsig.answerType = 5;
            AVsig.answerConstructor = "new Answer(AnswerIdentifier.Lambda())";
        
      break;
        default:
          throw new ARTException("ARTRD_AVsig: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_ID(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_ID ID) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*ID ::= &ID  .*/
    case ARTL_ART_ID_296: 
            ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, ID);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            ID.lexeme = artLexeme(ID.leftExtent, ID.rightExtent);
            ID.value = artLexemeAsID(ID.leftExtent, ID.rightExtent);
            if(ID.isVar) {
                if (!variableIdentifierMap.containsKey(ID.value)) {
                    if (noMoreVars) {
                        System.out.println(variableIdentifierMap);
                        System.out.println("ERROR: variable &" + ID.value + " cannot be used as it has not been bound in a pair yet, and is not typed.");
                        System.exit(-1);
                    }
                    variableIdentifierMap.put(ID.value, variableIdentifierMap.size());
                }
                ID.varID = variableIdentifierMap.get(ID.value);
            }
        
      break;
        default:
          throw new ARTException("ARTRD_ID: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_QV(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_QV QV, ARTAT_ART_QV QV1, ARTAT_ART_QVsig QVsig1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*QV ::= QVsig .*/
    case ARTL_ART_QV_180: 
      QV1 = new ARTAT_ART_QV();
      QVsig1 = new ARTAT_ART_QVsig();
      
            if (!QV.childOfQV) {
                if (++polyCount > polysEverDefinedCount) {
                    QV.polysString = tabTwo + "Polynomial poly" + polyCount;
                    polysEverDefinedCount++;
                } else {
                    QV.polysString = tabTwo + "poly" + polyCount;
                }
                QV.polysString += " = new Polynomial();" + newLine;
                QV.activePolynomial = polyCount;
            } else {
                QV.polysString = "";
            }
        
      ARTRD_QV(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QV, QV1, QVsig1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QVsig1));
      ARTRD_QVsig(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QVsig1, null, null, null, null, null);
      
            if (QVsig1.listStatements != null) QV.polysString += QVsig1.listStatements;
            QV.polysString += tabTwo + "poly" + QV.activePolynomial + ".add(" + QVsig1.queryConstructor + ");" + newLine;
        
      break;
    /*QV ::= QVsig QV .*/
    case ARTL_ART_QV_190: 
      QV1 = new ARTAT_ART_QV();
      QVsig1 = new ARTAT_ART_QVsig();
      
            if (!QV.childOfQV) {
                if (++polyCount > polysEverDefinedCount) {
                    QV.polysString = tabTwo + "Polynomial poly" + polyCount;
                    polysEverDefinedCount++;
                } else {
                    QV.polysString = tabTwo + "poly" + polyCount;
                }
                QV.polysString += " = new Polynomial();" + newLine;
                QV.activePolynomial = polyCount;
            } else {
                QV.polysString = "";
            }
            QV1.activePolynomial = QV.activePolynomial;
            QV1.childOfQV = true;
        
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), QVsig1));
      ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, QVsig1, null, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QV1));
      ARTRD_QV(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QV1, null, null);
      
            if (QVsig1.listStatements != null) QV.polysString += QVsig1.listStatements;
            QV.polysString += tabTwo + "poly" + QV.activePolynomial + ".add(" + QVsig1.queryConstructor + ");" + newLine;
            QV.polysString += QV1.polysString;
        
      break;
        default:
          throw new ARTException("ARTRD_QV: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_QVlist(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_QVlist QVlist, ARTAT_ART_QV QV1, ARTAT_ART_QVlist QVlist1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*QVlist ::= QV .*/
    case ARTL_ART_QVlist_198: 
      QV1 = new ARTAT_ART_QV();
      QVlist1 = new ARTAT_ART_QVlist();
      
            if (!QVlist.childOfQVlist) {
                if (++argsListCount > argsListEverDefinedCount) {
                    QVlist.argsString = tabTwo + "ArrayList<Polynomial> args" + argsListCount;
                    argsListEverDefinedCount = argsListCount;
                } else {
                    QVlist.argsString = tabTwo + "args" + argsListCount;
                }
                QVlist.argsString += " = new ArrayList<>();" + newLine;
                QVlist.activeArgsList = argsListCount;
            } else {
                QVlist.argsString = "";
            }
        
      ARTRD_QVlist(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVlist, QV1, QVlist1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QV1));
      ARTRD_QV(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QV1, null, null);
      
            QVlist.argsString += QV1.polysString;
            QVlist.argsString += tabTwo + "args" + QVlist.activeArgsList + ".add(poly" + QV1.activePolynomial + ");" + newLine;
            QVlist.listLength = 1;
        
      break;
    /*QVlist ::= QV ','  . QVlist */
    case ARTL_ART_QVlist_208: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), QV1));
      ARTRD_QV(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, QV1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*QVlist ::= QV ','  QVlist .*/
    case ARTL_ART_QVlist_210: 
      QV1 = new ARTAT_ART_QV();
      QVlist1 = new ARTAT_ART_QVlist();
      
            if (!QVlist.childOfQVlist) {
                if (++argsListCount > argsListEverDefinedCount) {
                    QVlist.argsString = tabTwo + "ArrayList<Polynomial> args" + argsListCount;
                    argsListEverDefinedCount = argsListCount;
                } else {
                    QVlist.argsString = tabTwo + "args" + argsListCount;
                }
                QVlist.argsString += " = new ArrayList<>();" + newLine;
                QVlist.activeArgsList = argsListCount;
            } else {
                QVlist.argsString = "";
            }
            QVlist1.activeArgsList = QVlist.activeArgsList;
            QVlist1.childOfQVlist = true;
        
      ARTRD_QVlist(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVlist, QV1, QVlist1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QVlist1));
      ARTRD_QVlist(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QVlist1, null, null);
      
            QVlist.argsString += QV1.polysString;
            QVlist.argsString += tabTwo + "args" + QVlist.activeArgsList + ".add(poly" + QV1.activePolynomial + ");" + newLine;
            QVlist.argsString += QVlist1.argsString;
            QVlist.listLength = 1 + QVlist1.listLength;
         
      break;
        default:
          throw new ARTException("ARTRD_QVlist: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_QVsig(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_QVsig QVsig, ARTAT_ART_ID ID1, ARTAT_ART_QV QV1, ARTAT_ART_QV QV2, ARTAT_ART_QVlist QVlist1, ARTAT_ART_STRING_SQ STRING_SQ1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*QVsig ::= ID .*/
    case ARTL_ART_QVsig_124: 
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      QV2 = new ARTAT_ART_QV();
      QVlist1 = new ARTAT_ART_QVlist();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVsig, ID1, QV1, QV2, QVlist1, STRING_SQ1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      
            if (!answerIDDefinitionMap.containsKey(ID1.value + "/0")) answerIDDefinitionMap.put(ID1.value + "/0", "nt_answer_" + ID1.value + "_0");
            String answerID1 = answerIDDefinitionMap.get(ID1.value + "/0");
            QVsig.queryConstructor = "new Answer(" + answerID1 + ")";
        
      break;
    /*QVsig ::= '&'  ID .*/
    case ARTL_ART_QVsig_134: 
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      QV2 = new ARTAT_ART_QV();
      QVlist1 = new ARTAT_ART_QVlist();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
      
            ID1.isVar = true;
        
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      
            QVsig.queryConstructor = "vars.get(" + ID1.varID + ")";
        
      break;
    /*QVsig ::= ID '['  . QVlist ']'  */
    case ARTL_ART_QVsig_142: 
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*QVsig ::= ID '['  QVlist . ']'  */
    case ARTL_ART_QVsig_144: 
      ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVsig, ID1, QV1, QV2, QVlist1, STRING_SQ1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QVlist1));
      ARTRD_QVlist(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QVlist1, null, null);
            break;
    /*QVsig ::= ID '['  QVlist ']'  .*/
    case ARTL_ART_QVsig_146: 
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      QV2 = new ARTAT_ART_QV();
      QVlist1 = new ARTAT_ART_QVlist();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVsig, ID1, QV1, QV2, QVlist1, STRING_SQ1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            int argsCount = QVlist1.listLength;
            if (!answerIDDefinitionMap.containsKey(ID1.value + "/" + argsCount)) answerIDDefinitionMap.put(ID1.value + "/" + argsCount, "nt_answer_" + ID1.value + "_" + argsCount);
            String answerID2 = answerIDDefinitionMap.get(ID1.value + "/" + argsCount);
            QVsig.queryConstructor = "new Answer(" + answerID2 + ", " + "args" + QVlist1.activeArgsList + ")";
            QVsig.listStatements = QVlist1.argsString;
        
      break;
    /*QVsig ::= STRING_SQ .*/
    case ARTL_ART_QVsig_152: 
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      QV2 = new ARTAT_ART_QV();
      QVlist1 = new ARTAT_ART_QVlist();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVsig, ID1, QV1, QV2, QVlist1, STRING_SQ1);
      STRING_SQ1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      STRING_SQ1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), STRING_SQ1));
      ARTRD_STRING_SQ(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, STRING_SQ1);
      
            if (!terminalIDDefinitionMap.containsKey(STRING_SQ1.value)) terminalIDDefinitionMap.put(STRING_SQ1.value, "tl_answer_" + terminalIDDefinitionMap.size());
            QVsig.queryConstructor = "new Answer(" + terminalIDDefinitionMap.get(STRING_SQ1.value) + ")";
        
      break;
    /*QVsig ::= '#'  .*/
    case ARTL_ART_QVsig_158: 
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      QV2 = new ARTAT_ART_QV();
      QVlist1 = new ARTAT_ART_QVlist();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVsig, ID1, QV1, QV2, QVlist1, STRING_SQ1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            QVsig.queryConstructor = "new Answer(AnswerIdentifier.Lambda())";
        
      break;
    /*QVsig ::= '('  QV . '?'  QV ')'  */
    case ARTL_ART_QVsig_166: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QV1));
      ARTRD_QV(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QV1, null, null);
            break;
    /*QVsig ::= '('  QV '?'  . QV ')'  */
    case ARTL_ART_QVsig_168: 
      ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVsig, ID1, QV1, QV2, QVlist1, STRING_SQ1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*QVsig ::= '('  QV '?'  QV . ')'  */
    case ARTL_ART_QVsig_170: 
      ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVsig, ID1, QV1, QV2, QVlist1, STRING_SQ1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QV2));
      ARTRD_QV(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QV2, null, null);
            break;
    /*QVsig ::= '('  QV '?'  QV ')'  .*/
    case ARTL_ART_QVsig_172: 
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      QV2 = new ARTAT_ART_QV();
      QVlist1 = new ARTAT_ART_QVlist();
      STRING_SQ1 = new ARTAT_ART_STRING_SQ();
            ARTRD_QVsig(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, QVsig, ID1, QV1, QV2, QVlist1, STRING_SQ1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      

            
            QVsig.listStatements = QV1.polysString + QV2.polysString;
            QVsig.queryConstructor = "new Query(poly" + QV1.activePolynomial + ", poly" + QV2.activePolynomial + ")";
        
      break;
        default:
          throw new ARTException("ARTRD_QVsig: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAG(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAG RAG, ARTAT_ART_RAG RAG1, ARTAT_ART_RAGrule RAGrule1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAG ::= RAGrule .*/
    case ARTL_ART_RAG_32: 
      RAG1 = new ARTAT_ART_RAG();
      RAGrule1 = new ARTAT_ART_RAGrule();
            ARTRD_RAG(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAG, RAG1, RAGrule1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGrule1));
      ARTRD_RAGrule(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, RAGrule1, null, null, null, null);
      
            RAG.ragRulesString = RAGrule1.ruleString;
        
      break;
    /*RAG ::= RAGrule RAG .*/
    case ARTL_ART_RAG_40: 
      RAG1 = new ARTAT_ART_RAG();
      RAGrule1 = new ARTAT_ART_RAGrule();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), RAGrule1));
      ARTRD_RAGrule(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, RAGrule1, null, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAG1));
      RAG.RAG1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      
            RAG.ragRulesString = RAGrule1.ruleString;
            artEvaluate(RAG.RAG1, RAG1);
            RAG.ragRulesString += RAG1.ragRulesString;
        
      break;
        default:
          throw new ARTException("ARTRD_RAG: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGIDList(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGIDList RAGIDList, ARTAT_ART_ID ID1, ARTAT_ART_RAGIDList RAGIDList1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGIDList ::= '&'  ID .*/
    case ARTL_ART_RAGIDList_358: 
      ID1 = new ARTAT_ART_ID();
      RAGIDList1 = new ARTAT_ART_RAGIDList();
      
            if (!RAGIDList.childOfRAGIDList) {
                RAGIDList.variableIDList = new ArrayList<Integer>();
            }
            ID1.isVar = true;
        
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      
            if (RAGIDList.variableToTypeMap != null && RAGIDList.variableToTypeMap.containsKey(ID1.varID)) {
                System.out.println("ERROR: Variable " + ID1.value + " defined twice in rule ranges.");
                System.exit(-1);
            }
            RAGIDList.variableIDList.add(ID1.varID);
        
      break;
    /*RAGIDList ::= '&'  ID . ','  RAGIDList */
    case ARTL_ART_RAGIDList_368: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*RAGIDList ::= '&'  ID ','  . RAGIDList */
    case ARTL_ART_RAGIDList_370: 
      ARTRD_RAGIDList(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGIDList, ID1, RAGIDList1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGIDList ::= '&'  ID ','  RAGIDList .*/
    case ARTL_ART_RAGIDList_372: 
      ID1 = new ARTAT_ART_ID();
      RAGIDList1 = new ARTAT_ART_RAGIDList();
      
            if (!RAGIDList.childOfRAGIDList) {
                RAGIDList.variableIDList = new ArrayList<Integer>();
            }
            RAGIDList1.childOfRAGIDList = true;
            RAGIDList1.variableIDList = RAGIDList.variableIDList;
            ID1.isVar = true;
        
      ARTRD_RAGIDList(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGIDList, ID1, RAGIDList1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGIDList1));
      RAGIDList.RAGIDList1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      
            if (RAGIDList.variableToTypeMap != null && RAGIDList.variableToTypeMap.containsKey(ID1.varID)) {
                System.out.println("ERROR: Variable " + ID1.value + " defined twice in rule ranges.");
                System.exit(-1);
            }
            RAGIDList.variableIDList.add(ID1.varID);
            artEvaluate(RAGIDList.RAGIDList1, RAGIDList1);
        
      break;
        default:
          throw new ARTException("ARTRD_RAGIDList: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGRangeCond(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGRangeCond RAGRangeCond, ARTAT_ART_ID ID1, ARTAT_ART_ID ID2) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGRangeCond ::= '&'  ID . '!='  '&'  ID */
    case ARTL_ART_RAGRangeCond_382: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
            break;
    /*RAGRangeCond ::= '&'  ID '!='  . '&'  ID */
    case ARTL_ART_RAGRangeCond_384: 
      ARTRD_RAGRangeCond(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeCond, ID1, ID2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGRangeCond ::= '&'  ID '!='  '&'  . ID */
    case ARTL_ART_RAGRangeCond_386: 
      ARTRD_RAGRangeCond(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeCond, ID1, ID2);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGRangeCond ::= '&'  ID '!='  '&'  ID .*/
    case ARTL_ART_RAGRangeCond_388: 
      ID1 = new ARTAT_ART_ID();
      ID2 = new ARTAT_ART_ID();
      
            ID1.isVar = true;
            ID2.isVar = true;
        
      ARTRD_RAGRangeCond(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeCond, ID1, ID2);
      ID2.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID2.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID2));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID2);
      
            RAGRangeCond.variableCondList = new ArrayList<String>();
            if (!RAGRangeCond.variableToTypeMap.containsKey(ID1.varID)) {
                System.out.println("ERROR: Variable '" + ID1.value + "' used before definition.");
                System.exit(-1);
            }
            if (!RAGRangeCond.variableToTypeMap.containsKey(ID2.varID)) {
                System.out.println("ERROR: Variable '" + ID2.value + "' used before definition.");
                System.exit(-1);
            }
            RAGRangeCond.variableCondList.add("new VariableCondition(vars.get(" + ID1.varID + "), vars.get(" + ID2.varID + "), VariableCondition.VariableConditionType.NE)");
        
      break;
        default:
          throw new ARTException("ARTRD_RAGRangeCond: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGRangeDef(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGRangeDef RAGRangeDef, ARTAT_ART_RAGIDList RAGIDList1, ARTAT_ART_RAGRangeSet RAGRangeSet1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGRangeDef ::= RAGIDList ':'  . RAGRangeSet */
    case ARTL_ART_RAGRangeDef_346: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), RAGIDList1));
      ARTRD_RAGIDList(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, RAGIDList1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGRangeDef ::= RAGIDList ':'  RAGRangeSet .*/
    case ARTL_ART_RAGRangeDef_348: 
      RAGIDList1 = new ARTAT_ART_RAGIDList();
      RAGRangeSet1 = new ARTAT_ART_RAGRangeSet();
      
            RAGIDList1.variableToTypeMap = RAGRangeDef.variableToTypeMap;
        
      ARTRD_RAGRangeDef(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeDef, RAGIDList1, RAGRangeSet1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGRangeSet1));
      ARTRD_RAGRangeSet(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, RAGRangeSet1);
      
            //RAGRangeDef.variableToTypeMap = new HashMap<Integer, String>();
            for (Integer i: (ArrayList<Integer>) RAGIDList1.variableIDList) {
                RAGRangeDef.variableToTypeMap.put(i, RAGRangeSet1.variableType);
            }
        
      break;
        default:
          throw new ARTException("ARTRD_RAGRangeDef: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGRangeExpr(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGRangeExpr RAGRangeExpr, ARTAT_ART_RAGRangeCond RAGRangeCond1, ARTAT_ART_RAGRangeDef RAGRangeDef1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGRangeExpr ::= RAGRangeDef .*/
    case ARTL_ART_RAGRangeExpr_328: 
      RAGRangeCond1 = new ARTAT_ART_RAGRangeCond();
      RAGRangeDef1 = new ARTAT_ART_RAGRangeDef();
      
            RAGRangeDef1.variableToTypeMap = RAGRangeExpr.variableToTypeMap;
        
      ARTRD_RAGRangeExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeExpr, RAGRangeCond1, RAGRangeDef1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGRangeDef1));
      ARTRD_RAGRangeDef(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, RAGRangeDef1, null, null);
      
            RAGRangeExpr.variableToTypeMap = RAGRangeDef1.variableToTypeMap;
            RAGRangeExpr.variableCondList = new ArrayList<String>();
        
      break;
    /*RAGRangeExpr ::= RAGRangeCond .*/
    case ARTL_ART_RAGRangeExpr_336: 
      RAGRangeCond1 = new ARTAT_ART_RAGRangeCond();
      RAGRangeDef1 = new ARTAT_ART_RAGRangeDef();
      
            RAGRangeCond1.variableToTypeMap = RAGRangeExpr.variableToTypeMap;
        
      ARTRD_RAGRangeExpr(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeExpr, RAGRangeCond1, RAGRangeDef1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGRangeCond1));
      ARTRD_RAGRangeCond(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, RAGRangeCond1, null, null);
      
            //RAGRangeExpr.variableToTypeMap = new HashMap<Integer, String>();
            RAGRangeExpr.variableCondList = RAGRangeCond1.variableCondList;
        
      break;
        default:
          throw new ARTException("ARTRD_RAGRangeExpr: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGRangeSet(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGRangeSet RAGRangeSet) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGRangeSet ::= '&LETTER'  .*/
    case ARTL_ART_RAGRangeSet_394: 
            ARTRD_RAGRangeSet(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeSet);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            RAGRangeSet.variableType = "LETTER_TYPE";
        
      break;
    /*RAGRangeSet ::= '&WORD'  .*/
    case ARTL_ART_RAGRangeSet_400: 
            ARTRD_RAGRangeSet(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeSet);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            RAGRangeSet.variableType = "WORD_TYPE";
        
      break;
    /*RAGRangeSet ::= '&ANSWER'  .*/
    case ARTL_ART_RAGRangeSet_406: 
            ARTRD_RAGRangeSet(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRangeSet);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            RAGRangeSet.variableType = "ANSWER_TYPE";
        
      break;
        default:
          throw new ARTException("ARTRD_RAGRangeSet: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGRanges(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGRanges RAGRanges, ARTAT_ART_RAGRangeExpr RAGRangeExpr1, ARTAT_ART_RAGRanges RAGRanges1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGRanges ::= # .*/
    case ARTL_ART_RAGRanges_310: 
      RAGRangeExpr1 = new ARTAT_ART_RAGRangeExpr();
      RAGRanges1 = new ARTAT_ART_RAGRanges();
      
            RAGRanges.variableToTypeMap = new HashMap<Integer, String>();
            RAGRanges.variableCondList = new ArrayList<String>();
        
      ARTRD_RAGRanges(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRanges, RAGRangeExpr1, RAGRanges1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGRanges ::= RAGRangeExpr ';'  . RAGRanges */
    case ARTL_ART_RAGRanges_318: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), RAGRangeExpr1));
      ARTRD_RAGRangeExpr(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, RAGRangeExpr1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGRanges ::= RAGRangeExpr ';'  RAGRanges .*/
    case ARTL_ART_RAGRanges_320: 
      RAGRangeExpr1 = new ARTAT_ART_RAGRangeExpr();
      RAGRanges1 = new ARTAT_ART_RAGRanges();
      
            if (!RAGRanges.childOfRAGRanges) {
                RAGRanges.variableToTypeMap = new HashMap<Integer, String>();
                RAGRanges.variableCondList = new ArrayList<String>();
            }
            RAGRangeExpr1.variableToTypeMap = RAGRanges.variableToTypeMap;
            RAGRangeExpr1.variableCondList = RAGRanges.variableCondList;
        
      ARTRD_RAGRanges(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGRanges, RAGRangeExpr1, RAGRanges1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGRanges1));
      RAGRanges.RAGRanges1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      
            RAGRanges.variableToTypeMap.putAll(RAGRangeExpr1.variableToTypeMap);
            RAGRanges.variableCondList.addAll(RAGRangeExpr1.variableCondList);
            RAGRanges1.variableToTypeMap = RAGRanges.variableToTypeMap;
            RAGRanges1.variableCondList = RAGRanges.variableCondList;
            RAGRanges1.childOfRAGRanges = true;
            artEvaluate(RAGRanges.RAGRanges1, RAGRanges1);
        
      break;
        default:
          throw new ARTException("ARTRD_RAGRanges: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGname(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGname RAGname, ARTAT_ART_ID ID1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGname ::= 'Name:'  ID .*/
    case ARTL_ART_RAGname_18: 
      ID1 = new ARTAT_ART_ID();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      ARTRD_ID(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, ID1);
      
            RAGname.ragName = ID1.value;
        
      break;
        default:
          throw new ARTException("ARTRD_RAGname: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGrhs(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGrhs RAGrhs, ARTAT_ART_AVsig AVsig1, ARTAT_ART_ID ID1, ARTAT_ART_QV QV1, ARTAT_ART_RAGrhs RAGrhs1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGrhs ::= AVsig .*/
    case ARTL_ART_RAGrhs_238: 
      AVsig1 = new ARTAT_ART_AVsig();
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      RAGrhs1 = new ARTAT_ART_RAGrhs();
            ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AVsig1));
      ARTRD_AVsig(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AVsig1, null, null, null);
      
            if (AVsig1.answerType != 4 && AVsig1.answerType != 5) {
                System.out.println("ERROR: Only terminals and # may appear outside of a pair.");
                System.exit(-1);
            }
            RAGrhs.rhsStatements = tabTwo + "c.add(" + AVsig1.answerConstructor + ");" + newLine + newLine;
        
      break;
    /*RAGrhs ::= '<'  QV . ','  '&'  ID '>'  */
    case ARTL_ART_RAGrhs_248: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QV1));
      ARTRD_QV(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QV1, null, null);
            break;
    /*RAGrhs ::= '<'  QV ','  . '&'  ID '>'  */
    case ARTL_ART_RAGrhs_250: 
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrhs ::= '<'  QV ','  '&'  . ID '>'  */
    case ARTL_ART_RAGrhs_252: 
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrhs ::= '<'  QV ','  '&'  ID . '>'  */
    case ARTL_ART_RAGrhs_254: 
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      RAGrhs.ID1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*RAGrhs ::= '<'  QV ','  '&'  ID '>'  .*/
    case ARTL_ART_RAGrhs_256: 
      AVsig1 = new ARTAT_ART_AVsig();
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      RAGrhs1 = new ARTAT_ART_RAGrhs();
      
            noMoreVars = true;
        
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            noMoreVars = false;
            ID1.isVar = true;
            artEvaluate(RAGrhs.ID1, ID1);
            RAGrhs.rhsStatements = QV1.polysString;
            RAGrhs.rhsStatements += tabTwo + "c.add(new Pair(poly" + QV1.activePolynomial + ", vars.get(" + ID1.varID + ")));" + newLine + newLine;
        
      break;
    /*RAGrhs ::= AVsig RAGrhs .*/
    case ARTL_ART_RAGrhs_264: 
      AVsig1 = new ARTAT_ART_AVsig();
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      RAGrhs1 = new ARTAT_ART_RAGrhs();
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), AVsig1));
      ARTRD_AVsig(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, AVsig1, null, null, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGrhs1));
      RAGrhs.RAGrhs1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      
            if (AVsig1.answerType != 4 && AVsig1.answerType != 5) {
                System.out.println("ERROR: Only terminals and # may appear outside of a pair.");
                System.exit(-1);
            }
            RAGrhs.rhsStatements = tabTwo + "c.add(" + AVsig1.answerConstructor + ");" + newLine;
            RAGrhs.rhsStatements += newLine;
            artEvaluate(RAGrhs.RAGrhs1, RAGrhs1);
            RAGrhs.rhsStatements += RAGrhs1.rhsStatements;
        
      break;
    /*RAGrhs ::= '<'  QV . ','  '&'  ID '>'  RAGrhs */
    case ARTL_ART_RAGrhs_274: 
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QV1));
      ARTRD_QV(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, QV1, null, null);
            break;
    /*RAGrhs ::= '<'  QV ','  . '&'  ID '>'  RAGrhs */
    case ARTL_ART_RAGrhs_276: 
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrhs ::= '<'  QV ','  '&'  . ID '>'  RAGrhs */
    case ARTL_ART_RAGrhs_278: 
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrhs ::= '<'  QV ','  '&'  ID . '>'  RAGrhs */
    case ARTL_ART_RAGrhs_280: 
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      ID1.rightExtent = artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode));
      ID1.leftExtent = artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode));
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), ID1));
      RAGrhs.ID1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*RAGrhs ::= '<'  QV ','  '&'  ID '>'  . RAGrhs */
    case ARTL_ART_RAGrhs_282: 
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrhs ::= '<'  QV ','  '&'  ID '>'  RAGrhs .*/
    case ARTL_ART_RAGrhs_284: 
      AVsig1 = new ARTAT_ART_AVsig();
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      RAGrhs1 = new ARTAT_ART_RAGrhs();
      
            noMoreVars = true;
        
      ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGrhs1));
      RAGrhs.RAGrhs1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      
            noMoreVars = false;
            ID1.isVar = true;
            artEvaluate(RAGrhs.ID1, ID1);
            RAGrhs.rhsStatements = QV1.polysString;
            RAGrhs.rhsStatements += tabTwo + "c.add(new Pair(poly" + QV1.activePolynomial + ", vars.get(" + ID1.varID + ")));" + newLine;
            RAGrhs.rhsStatements += newLine;
            artEvaluate(RAGrhs.RAGrhs1, RAGrhs1);
            RAGrhs.rhsStatements += RAGrhs1.rhsStatements;
        
      break;
    /*RAGrhs ::= '{}'  .*/
    case ARTL_ART_RAGrhs_290: 
      AVsig1 = new ARTAT_ART_AVsig();
      ID1 = new ARTAT_ART_ID();
      QV1 = new ARTAT_ART_QV();
      RAGrhs1 = new ARTAT_ART_RAGrhs();
            ARTRD_RAGrhs(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrhs, AVsig1, ID1, QV1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            hasEmptySet = true;
            RAGrhs.rhsStatements = tabTwo + "c.add(new Answer(new AnswerIdentifier(answer_EmptySet)));" + newLine;
        
      break;
        default:
          throw new ARTException("ARTRD_RAGrhs: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGrule(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGrule RAGrule, ARTAT_ART_AVsig AVsig1, ARTAT_ART_QV QV1, ARTAT_ART_RAGRanges RAGRanges1, ARTAT_ART_RAGrhs RAGrhs1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGrule ::= RAGRanges '<'  . AVsig ','  QV '>'  '->'  RAGrhs */
    case ARTL_ART_RAGrule_220: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), RAGRanges1));
      ARTRD_RAGRanges(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, RAGRanges1, null, null);
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrule ::= RAGRanges '<'  AVsig . ','  QV '>'  '->'  RAGrhs */
    case ARTL_ART_RAGrule_222: 
      ARTRD_RAGrule(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrule, AVsig1, QV1, RAGRanges1, RAGrhs1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AVsig1));
      ARTRD_AVsig(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AVsig1, null, null, null);
            break;
    /*RAGrule ::= RAGRanges '<'  AVsig ','  . QV '>'  '->'  RAGrhs */
    case ARTL_ART_RAGrule_224: 
      ARTRD_RAGrule(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrule, AVsig1, QV1, RAGRanges1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrule ::= RAGRanges '<'  AVsig ','  QV . '>'  '->'  RAGrhs */
    case ARTL_ART_RAGrule_226: 
      ARTRD_RAGrule(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrule, AVsig1, QV1, RAGRanges1, RAGrhs1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), QV1));
      RAGrule.QV1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  . '->'  RAGrhs */
    case ARTL_ART_RAGrule_228: 
      ARTRD_RAGrule(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrule, AVsig1, QV1, RAGRanges1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  '->'  . RAGrhs */
    case ARTL_ART_RAGrule_230: 
      ARTRD_RAGrule(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrule, AVsig1, QV1, RAGRanges1, RAGrhs1);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
            break;
    /*RAGrule ::= RAGRanges '<'  AVsig ','  QV '>'  '->'  RAGrhs .*/
    case ARTL_ART_RAGrule_232: 
      AVsig1 = new ARTAT_ART_AVsig();
      QV1 = new ARTAT_ART_QV();
      RAGRanges1 = new ARTAT_ART_RAGRanges();
      RAGrhs1 = new ARTAT_ART_RAGrhs();
      
            polyCount = 0;
            argsListCount = 0;

            distinctVarsSeenInArgs = new ArrayList<>();
            variableIdentifierMap = new HashMap<>();
            variableIdentifierMap.put("v0", 0);
        
      ARTRD_RAGrule(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, RAGrule, AVsig1, QV1, RAGRanges1, RAGrhs1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGrhs1));
      RAGrule.RAGrhs1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
      

            argsListCount = 1;
            artEvaluate(RAGrule.RAGrhs1, RAGrhs1);

            RAGrule.ruleString = tabTwo + "vars = new ArrayList<>();" + newLine;
            RAGrule.ruleString += tabTwo + "varSet = new VariableSet();" + newLine;
            RAGrule.ruleString += tabTwo + "args1 = new ArrayList<>();" + newLine;
            RAGrule.ruleString += tabTwo + "conditions = new ArrayList<>();" + newLine;
            RAGrule.ruleString += tabTwo + "for (int i = 0; i < " + variableIdentifierMap.size() + "; i++) {" + newLine;
            RAGrule.ruleString += tabThree + "Variable v = new Variable();" + newLine;
            RAGrule.ruleString += tabThree + "vars.add(v);" + newLine;
            RAGrule.ruleString += tabThree + "varSet.put(v);" + newLine;
            RAGrule.ruleString += tabTwo + "}" + newLine + newLine;
            RAGrule.ruleString += tabTwo + "args1.add(new Polynomial(vars.get(0)));" + newLine;

            if (AVsig1.argsListStatements != null) RAGrule.ruleString += AVsig1.argsListStatements;

            for (Integer i: (Set<Integer>) RAGRanges1.variableToTypeMap.keySet())
                RAGrule.ruleString += tabTwo + "vars.get(" + i + ").setType(Type." + RAGRanges1.variableToTypeMap.get(i) + ");" + newLine;

            for (String conditionString: (ArrayList<String>) RAGRanges1.variableCondList)
                RAGrule.ruleString += tabTwo + "conditions.add(" + conditionString + ");" + newLine;

            RAGrule.ruleString += newLine + tabTwo + "c = new Configuration();" + newLine + newLine;
            
            RAGrule.ruleString += RAGrhs1.rhsStatements;

            noMoreVars = true;
            artEvaluate(RAGrule.QV1, QV1);
            noMoreVars = false;
            RAGrule.ruleString += QV1.polysString + newLine;

            RAGrule.ruleString += tabTwo + "g.addRule(" + AVsig1.answerID + ", new Rule(c, varSet, poly" + QV1.activePolynomial + ", args1, conditions));" + newLine;
            RAGrule.ruleString += tabTwo + "//////////////////////////////////////////////////" + newLine;

            RAGrule.nonTerminalSymbol = AVsig1.answerID;

        
      break;
        default:
          throw new ARTException("ARTRD_RAGrule: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_RAGstartsymbol(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_RAGstartsymbol RAGstartsymbol, ARTAT_ART_AVsig AVsig1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*RAGstartsymbol ::= 'Start:'  AVsig .*/
    case ARTL_ART_RAGstartsymbol_26: 
      AVsig1 = new ARTAT_ART_AVsig();
            artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), null));
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), AVsig1));
      ARTRD_AVsig(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, AVsig1, null, null, null);
      
            if (AVsig1.answerType != 1  && AVsig1.answerType != 3) {
                System.out.println("Error: Start symbol must be a non-terminal answer.");
                System.exit(-1);
            }
            RAGstartsymbol.ragStartSymbolStatements = 
                (AVsig1.argsListStatements != null) ? AVsig1.argsListStatements : "";
            RAGstartsymbol.ragStartSymbol = AVsig1.answerConstructor;
            RAGstartsymbol.startSymbolID = AVsig1.answerID;
        
      break;
        default:
          throw new ARTException("ARTRD_RAGstartsymbol: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_STRING_SQ(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_STRING_SQ STRING_SQ) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*STRING_SQ ::= &STRING_SQ  .*/
    case ARTL_ART_STRING_SQ_302: 
            ARTRD_STRING_SQ(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, STRING_SQ);
      artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), null));
      
            STRING_SQ.value = quotation + artLexemeAsString(STRING_SQ.leftExtent, STRING_SQ.rightExtent) + quotation;
        
      break;
        default:
          throw new ARTException("ARTRD_STRING_SQ: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void ARTRD_Start(int artElement, ARTGLLRDTVertex artParent, boolean artWriteable, ARTAT_ART_Start Start, ARTAT_ART_RAG RAG1, ARTAT_ART_RAGname RAGname1, ARTAT_ART_RAGstartsymbol RAGstartsymbol1) throws ARTException {
ARTGLLRDTVertex artNewParent; boolean artNewWriteable = true;
    for (int artPackedNode = artSPPFNodePackedNodeList(artElement); artPackedNode != 0; artPackedNode = artSPPFPackedNodePackedNodeList(artPackedNode)) {
      if (artSPPFPackedNodeSelected(artPackedNode)) {
        switch (artSPPFPackedNodeLabel(artPackedNode)) {
    /*Start ::= RAGname RAGstartsymbol . RAG */
    case ARTL_ART_Start_8: 
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeLeftChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeLeftChild(artPackedNode)), RAGname1));
      ARTRD_RAGname(artSPPFPackedNodeLeftChild(artPackedNode), artNewParent, artNewWriteable, RAGname1, null);
            artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAGstartsymbol1));
      Start.RAGstartsymbol1 = new ARTGLLRDTHandle(artSPPFPackedNodeRightChild(artPackedNode));
            break;
    /*Start ::= RAGname RAGstartsymbol RAG .*/
    case ARTL_ART_Start_10: 
      RAG1 = new ARTAT_ART_RAG();
      RAGname1 = new ARTAT_ART_RAGname();
      RAGstartsymbol1 = new ARTAT_ART_RAGstartsymbol();
      
            answerIDDefinitionMap = new HashMap<>();
            terminalIDDefinitionMap = new HashMap<>();
            variableIdentifierMap = new HashMap<>();
        
      ARTRD_Start(artSPPFPackedNodeLeftChild(artPackedNode), artParent, artWriteable, Start, RAG1, RAGname1, RAGstartsymbol1);
      artNewWriteable = true; artNewParent = artParent.addChild(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeRightExtent(artSPPFPackedNodeRightChild(artPackedNode)), artSPPFNodeLabel(artSPPFPackedNodeRightChild(artPackedNode)), RAG1));
      ARTRD_RAG(artSPPFPackedNodeRightChild(artPackedNode), artNewParent, artNewWriteable, RAG1, null, null);
      
            try {

                String ragName = RAGname1.ragName;
                
                String toWrite = "package rnsr.rag.examples;" + newLine;
                toWrite += "import rnsr.rag.grammar.*;" + newLine + "import rnsr.rag.grammar.exception.ArgumentMismatchException;" + newLine + "import rnsr.rag.grammar.exception.RuleFunctionException;" + newLine + "import rnsr.rag.grammar.exception.VariableNotFoundException;" + newLine + "import java.util.ArrayList;" + newLine + "import java.util.HashSet;" + newLine + "import rnsr.rag.grammar.types.Type;" + newLine;
                toWrite += "public class " + ragName + " extends CommandLineInputBase {" + newLine;
                toWrite += tabOne + "public Grammar CreateRAG() throws ArgumentMismatchException, RuleFunctionException, VariableNotFoundException {" + newLine;

                for (String answerKey: answerIDDefinitionMap.keySet()) {
                    String[] answerKeyNameArr = answerKey.split("/");
                    String answerVarName = answerIDDefinitionMap.get(answerKey);
                    int argCount = Integer.parseInt(answerKeyNameArr[1]);
                    toWrite += tabTwo + "AnswerIdentifier " + answerVarName + " = new AnswerIdentifier(" + quotation + answerKeyNameArr[0] + quotation + ", " + argCount + ");" + newLine;
                }

                if (hasEmptySet) toWrite += tabTwo + "AnswerIdentifier answer_EmptySet = new AnswerIdentifier(" + quotation + "empty" + quotation + ", 0);" + newLine;

                for (String answerKey: terminalIDDefinitionMap.keySet()) {
                    toWrite += tabTwo + "AnswerIdentifier " + terminalIDDefinitionMap.get(answerKey) + " = new AnswerIdentifier(" + answerKey + ");" + newLine;
                }

                toWrite += tabTwo + "ArrayList<Variable> vars;" + newLine;
                toWrite += tabTwo + "ArrayList<VariableCondition> conditions;" + newLine;
                toWrite += tabTwo + "VariableSet varSet;" + newLine;
                toWrite += tabTwo + "Configuration c;" + newLine;

                toWrite += tabTwo + "////////////////////////////////////////////////////" + newLine;
                noMoreAnswerID = true;
                artEvaluate(Start.RAGstartsymbol1, RAGstartsymbol1);

                if (!answerIDDefinitionMap.containsValue(RAGstartsymbol1.startSymbolID)) {
                    System.out.println("ERROR: Given start answer has no associated rules.");
                    writer.close();
                    System.exit(-1);
                }

                toWrite += tabTwo + "ArrayList<Polynomial> args1" 
                    + ((RAGstartsymbol1.ragStartSymbolStatements.length() > 0) ? " = new ArrayList<>();" : ";") + newLine;
                toWrite += RAGstartsymbol1.ragStartSymbolStatements;
                toWrite += tabTwo + "Grammar g = new Grammar(" + RAGstartsymbol1.ragStartSymbol + ");" + newLine;
                toWrite += tabTwo + "////////////////////////////////////////////////////" + newLine;

                toWrite += RAG1.ragRulesString;
                toWrite += tabTwo + "return g;" + newLine;
                toWrite += tabOne + "}" + newLine;

                toWrite += tabOne + "public static void main(String[] args) " + leftBrace + newLine + tabTwo + "if (args.length == 0) " + leftBrace + newLine + tabThree + "System.err.println(" + quotation + "ERROR: Expecting some input to parse!" + quotation + ");" + newLine + tabThree + "System.exit(-1);" + newLine + tabTwo + rightBrace + newLine + tabTwo + "performTest(new " + ragName + "(), args[0]);" + newLine + tabOne + rightBrace + newLine;

                toWrite += "}";

                System.out.println("Created output Java file in directory " + System.getProperty("user.dir"));
                writer = new BufferedWriter(new FileWriter(ragName +  ".java"));
                writer.write(toWrite);

            } catch (IOException e) {
                System.out.println("EROR: Could not write to file " + ragName + ".java.");
                System.exit(-1);
            } finally {
                if (writer != null) {
                    try {
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();    
                    }
                }
            }
        
      break;
        default:
          throw new ARTException("ARTRD_Start: unhandled pack node " + artPackedNode + " with label " + artSPPFPackedNodeLabel(artPackedNode) + " - " + artLabelInternalStrings[artSPPFPackedNodeLabel(artPackedNode)]);
        }
      }
    }
}

public void artEvaluate(ARTGLLRDTHandle artElement, Object artAttributes, ARTGLLRDTVertex artParent, Boolean artWriteable) throws ARTException {
  switch (artSPPFNodeLabel(artElement.element)) {
    case ARTL_ART_AV:  ARTRD_AV(artElement.element, artParent, artWriteable, (ARTAT_ART_AV) artAttributes, null, null); break;
    case ARTL_ART_AVarglist:  ARTRD_AVarglist(artElement.element, artParent, artWriteable, (ARTAT_ART_AVarglist) artAttributes, null, null); break;
    case ARTL_ART_AVsig:  ARTRD_AVsig(artElement.element, artParent, artWriteable, (ARTAT_ART_AVsig) artAttributes, null, null, null); break;
    case ARTL_ART_ID:  ARTRD_ID(artElement.element, artParent, artWriteable, (ARTAT_ART_ID) artAttributes); break;
    case ARTL_ART_QV:  ARTRD_QV(artElement.element, artParent, artWriteable, (ARTAT_ART_QV) artAttributes, null, null); break;
    case ARTL_ART_QVlist:  ARTRD_QVlist(artElement.element, artParent, artWriteable, (ARTAT_ART_QVlist) artAttributes, null, null); break;
    case ARTL_ART_QVsig:  ARTRD_QVsig(artElement.element, artParent, artWriteable, (ARTAT_ART_QVsig) artAttributes, null, null, null, null, null); break;
    case ARTL_ART_RAG:  ARTRD_RAG(artElement.element, artParent, artWriteable, (ARTAT_ART_RAG) artAttributes, null, null); break;
    case ARTL_ART_RAGIDList:  ARTRD_RAGIDList(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGIDList) artAttributes, null, null); break;
    case ARTL_ART_RAGRangeCond:  ARTRD_RAGRangeCond(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGRangeCond) artAttributes, null, null); break;
    case ARTL_ART_RAGRangeDef:  ARTRD_RAGRangeDef(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGRangeDef) artAttributes, null, null); break;
    case ARTL_ART_RAGRangeExpr:  ARTRD_RAGRangeExpr(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGRangeExpr) artAttributes, null, null); break;
    case ARTL_ART_RAGRangeSet:  ARTRD_RAGRangeSet(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGRangeSet) artAttributes); break;
    case ARTL_ART_RAGRanges:  ARTRD_RAGRanges(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGRanges) artAttributes, null, null); break;
    case ARTL_ART_RAGname:  ARTRD_RAGname(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGname) artAttributes, null); break;
    case ARTL_ART_RAGrhs:  ARTRD_RAGrhs(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGrhs) artAttributes, null, null, null, null); break;
    case ARTL_ART_RAGrule:  ARTRD_RAGrule(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGrule) artAttributes, null, null, null, null); break;
    case ARTL_ART_RAGstartsymbol:  ARTRD_RAGstartsymbol(artElement.element, artParent, artWriteable, (ARTAT_ART_RAGstartsymbol) artAttributes, null); break;
    case ARTL_ART_STRING_SQ:  ARTRD_STRING_SQ(artElement.element, artParent, artWriteable, (ARTAT_ART_STRING_SQ) artAttributes); break;
    case ARTL_ART_Start:  ARTRD_Start(artElement.element, artParent, artWriteable, (ARTAT_ART_Start) artAttributes, null, null, null); break;
  }
}

public ARTGLLRDT artEvaluator() throws ARTException {
  ARTAT_ART_Start Start1 = new ARTAT_ART_Start();
  return  artEvaluator(Start1);
}

public ARTGLLRDT artEvaluator(ARTAT_ART_Start Start1) throws ARTException {
  artRDT = new ARTGLLRDT("RDT", artKindOfs, artLabelStrings, artLexer.artInputString);
  ARTGLLRDTVertex artNewParent = new ARTGLLRDTVertex(artNextFreeNodeNumber++, new ARTGLLRDTPayload(artRDT, artSPPFNodeLeftExtent(artRootSPPFNode),artSPPFNodeRightExtent(artRootSPPFNode),artSPPFNodeLabel(artRootSPPFNode), Start1));
  artRDT.setRoot(artNewParent);
  boolean artNewWriteable = true;
  artEvaluate(new ARTGLLRDTHandle(artRootSPPFNode), Start1, artNewParent, artNewWriteable);
  return artRDT;
}
};
