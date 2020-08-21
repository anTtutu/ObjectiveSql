/* ParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package com.github.braisdom.jsql;
import java.util.*;
import com.github.braisdom.jsql.ast.*;

/** Token Manager. */
@SuppressWarnings ("unused")
class ParserTokenManager implements ParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7c0000000000L) != 0L)
         {
            jjmatchedKind = 47;
            return 16;
         }
         if ((active0 & 0x1000000000L) != 0L)
            return 35;
         if ((active0 & 0x800000000L) != 0L)
            return 13;
         if ((active0 & 0x40000L) != 0L)
            return 0;
         if ((active0 & 0x100000L) != 0L)
            return 18;
         if ((active0 & 0x2000000000L) != 0L)
            return 36;
         return -1;
      case 1:
         if ((active0 & 0x400000000000L) != 0L)
            return 16;
         if ((active0 & 0x3c0000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 1;
            return 16;
         }
         return -1;
      case 2:
         if ((active0 & 0x3c0000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 2;
            return 16;
         }
         return -1;
      case 3:
         if ((active0 & 0x200000000000L) != 0L)
            return 16;
         if ((active0 & 0x1c0000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 3;
            return 16;
         }
         return -1;
      case 4:
         if ((active0 & 0x1c0000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 4;
            return 16;
         }
         return -1;
      case 5:
         if ((active0 & 0x40000000000L) != 0L)
            return 16;
         if ((active0 & 0x180000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 5;
            return 16;
         }
         return -1;
      case 6:
         if ((active0 & 0x80000000000L) != 0L)
            return 16;
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 6;
            return 16;
         }
         return -1;
      case 7:
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 7;
            return 16;
         }
         return -1;
      case 8:
         if ((active0 & 0x100000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 8;
            return 16;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 34:
         return jjStartNfaWithStates_0(0, 37, 36);
      case 37:
         return jjStopAtPos(0, 21);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 39:
         return jjStartNfaWithStates_0(0, 36, 35);
      case 40:
         return jjStopAtPos(0, 26);
      case 41:
         return jjStopAtPos(0, 27);
      case 42:
         return jjStopAtPos(0, 19);
      case 43:
         return jjStopAtPos(0, 17);
      case 44:
         return jjStopAtPos(0, 33);
      case 45:
         return jjStartNfaWithStates_0(0, 18, 0);
      case 46:
         return jjStopAtPos(0, 34);
      case 47:
         return jjStartNfaWithStates_0(0, 20, 18);
      case 58:
         return jjStartNfaWithStates_0(0, 35, 13);
      case 59:
         return jjStopAtPos(0, 32);
      case 60:
         jjmatchedKind = 11;
         return jjMoveStringLiteralDfa1_0(0xa000L);
      case 61:
         return jjStopAtPos(0, 9);
      case 62:
         jjmatchedKind = 10;
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 63:
         return jjStopAtPos(0, 12);
      case 91:
         return jjStopAtPos(0, 30);
      case 93:
         return jjStopAtPos(0, 31);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x400000000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x80000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200000000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      case 123:
         return jjStopAtPos(0, 28);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 125:
         return jjStopAtPos(0, 29);
      case 126:
         jjmatchedKind = 25;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      default :
         return jjMoveNfa_0(2, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         break;
      case 61:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 62:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x300000000000L);
      case 115:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 46, 16);
         break;
      case 124:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(1, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x300000000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000L);
      case 106:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000000L);
      case 109:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 45, 16);
         break;
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000000000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000000L);
      case 116:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 42, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 43, 16);
         return jjMoveStringLiteralDfa7_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 110:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(9, 44, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 35;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 35:
                  { jjCheckNAddTwoStates(4, 5); }
                  if (curChar == 39)
                  {
                     if (kind > 38)
                        kind = 38;
                  }
                  break;
               case 2:
                  if (curChar == 45)
                     { jjCheckNAddTwoStates(30, 32); }
                  else if (curChar == 47)
                     { jjAddStates(0, 1); }
                  else if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 34)
                     { jjCheckNAddTwoStates(7, 8); }
                  else if (curChar == 39)
                     { jjCheckNAddTwoStates(4, 5); }
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 18:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(24, 25); }
                  else if (curChar == 47)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(32, 33); }
                  else if (curChar == 45)
                  {
                     if (kind > 8)
                        kind = 8;
                     { jjCheckNAdd(1); }
                  }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 50)
                        kind = 50;
                     { jjCheckNAdd(31); }
                  }
                  break;
               case 36:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(7, 8); }
                  else if (curChar == 34)
                  {
                     if (kind > 39)
                        kind = 39;
                  }
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  { jjCheckNAdd(1); }
                  break;
               case 3:
                  if (curChar == 39)
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 4:
                  { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 5:
                  if (curChar == 39 && kind > 38)
                     kind = 38;
                  break;
               case 6:
                  if (curChar == 34)
                     { jjCheckNAddTwoStates(7, 8); }
                  break;
               case 7:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(7, 8); }
                  break;
               case 8:
                  if (curChar == 34 && kind > 39)
                     kind = 39;
                  break;
               case 10:
                  if ((0xffffff7bffffffffL & l) != 0L)
                     { jjAddStates(5, 6); }
                  break;
               case 12:
                  if (curChar == 58)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 17:
                  if (curChar == 47)
                     { jjAddStates(0, 1); }
                  break;
               case 19:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(2, 4); }
                  break;
               case 20:
                  if ((0x2400L & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 21:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 22:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 24:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 25:
                  if (curChar == 42)
                     { jjAddStates(7, 8); }
                  break;
               case 26:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(27, 25); }
                  break;
               case 27:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(27, 25); }
                  break;
               case 28:
                  if (curChar == 47 && kind > 7)
                     kind = 7;
                  break;
               case 29:
                  if (curChar == 45)
                     { jjCheckNAddTwoStates(30, 32); }
                  break;
               case 30:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(31); }
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 50)
                     kind = 50;
                  { jjCheckNAdd(31); }
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(32, 33); }
                  break;
               case 33:
                  if (curChar != 46)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(34); }
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  { jjCheckNAdd(34); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 35:
               case 4:
                  { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 2:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 47)
                        kind = 47;
                     { jjCheckNAdd(16); }
                  }
                  else if (curChar == 96)
                     { jjCheckNAdd(10); }
                  break;
               case 36:
               case 7:
                  { jjCheckNAddTwoStates(7, 8); }
                  break;
               case 1:
                  if (kind > 8)
                     kind = 8;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 9:
                  if (curChar == 96)
                     { jjCheckNAdd(10); }
                  break;
               case 10:
                  if ((0xfffffffeffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(10, 11); }
                  break;
               case 11:
                  if (curChar == 96 && kind > 40)
                     kind = 40;
                  break;
               case 13:
               case 14:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAdd(14); }
                  break;
               case 15:
               case 16:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  { jjCheckNAdd(16); }
                  break;
               case 19:
                  { jjAddStates(2, 4); }
                  break;
               case 24:
                  { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 26:
               case 27:
                  { jjCheckNAddTwoStates(27, 25); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 35:
               case 4:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(4, 5); }
                  break;
               case 36:
               case 7:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(7, 8); }
                  break;
               case 1:
                  if (!jjCanMove_0(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 10:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(5, 6); }
                  break;
               case 19:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(2, 4); }
                  break;
               case 24:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 26:
               case 27:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(27, 25); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 35 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\75", "\76", "\74", 
"\77", "\74\75", "\76\75", "\74\76", "\41\75", "\53", "\55", "\52", "\57", "\45", 
"\174\174", "\46\46", "\176\75", "\176", "\50", "\51", "\173", "\175", "\133", "\135", 
"\73", "\54", "\56", "\72", "\47", "\42", null, null, null, null, 
"\151\155\160\157\162\164", "\144\141\164\141\163\145\164", "\160\162\157\152\145\143\164\151\157\156", 
"\146\162\157\155", "\141\163", null, null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   t = Token.newToken(jjmatchedKind, curTokenImage);

   return t;
}
static final int[] jjnextStates = {
   18, 23, 19, 20, 22, 10, 11, 26, 28, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public ParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 35; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, 
};
static final long[] jjtoToken = {
   0xcfffffffffe01L, 
};
static final long[] jjtoSkip = {
   0x1feL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[35];
    private final int[] jjstateSet = new int[2 * 35];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
