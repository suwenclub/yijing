/* Generated By:JavaCC: Do not edit this line. ELParserTokenManager.java */
package org.boc.rule.format;
import org.boc.rule.*;

import java.util.*;
import java.io.*;

public class ELParserTokenManager implements ELParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xc4000006ee5dca80L) != 0L || (active1 & 0x76c9b6L) != 0L)
         {
            jjmatchedKind = 93;
            return 7;
         }
         if ((active0 & 0x1000L) != 0L)
            return 2;
         if ((active0 & 0x899800000800500L) != 0L || (active1 & 0x5091000L) != 0L)
            return 7;
         return -1;
      case 1:
         if ((active0 & 0xc40000044c000a80L) != 0L || (active1 & 0x120104L) != 0L)
         {
            jjmatchedKind = 93;
            jjmatchedPos = 1;
            return 7;
         }
         if ((active0 & 0x2a25dc000L) != 0L || (active1 & 0x565c8b2L) != 0L)
            return 7;
         return -1;
      case 2:
         if ((active0 & 0xa80L) != 0L || (active1 & 0x120100L) != 0L)
         {
            jjmatchedKind = 93;
            jjmatchedPos = 2;
            return 7;
         }
         if ((active0 & 0xc40000044c000000L) != 0L || (active1 & 0x4L) != 0L)
            return 7;
         return -1;
      case 3:
         if ((active0 & 0x200L) != 0L || (active1 & 0x100L) != 0L)
         {
            jjmatchedKind = 93;
            jjmatchedPos = 3;
            return 7;
         }
         if ((active0 & 0x880L) != 0L || (active1 & 0x120000L) != 0L)
            return 7;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 64;
         return jjMoveStringLiteralDfa1_0(0x100000000L, 0x0L);
      case 37:
         return jjStopAtPos(0, 61);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8L);
      case 40:
         return jjStopAtPos(0, 35);
      case 41:
         return jjStopAtPos(0, 37);
      case 42:
         return jjStopAtPos(0, 54);
      case 43:
         jjmatchedKind = 46;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x800000L);
      case 44:
         return jjStopAtPos(0, 41);
      case 45:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x2000000L);
      case 46:
         return jjStartNfaWithStates_0(0, 12, 2);
      case 47:
         return jjStopAtPos(0, 57);
      case 58:
         return jjStopAtPos(0, 43);
      case 59:
         return jjStopAtPos(0, 39);
      case 60:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x1000000L, 0x0L);
      case 61:
         jjmatchedKind = 74;
         return jjMoveStringLiteralDfa1_0(0x200000L, 0x0L);
      case 62:
         jjmatchedKind = 13;
         return jjMoveStringLiteralDfa1_0(0x10000000L, 0x0L);
      case 63:
         return jjStopAtPos(0, 73);
      case 91:
         return jjStopAtPos(0, 44);
      case 93:
         return jjStopAtPos(0, 45);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x400000000000000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400000L, 0x100100L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200L, 0x0L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x20004000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x2040000L, 0x0L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x4000000000000000L, 0x0L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x8000000200000800L, 0x0L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x20L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x80L, 0x20000L);
      case 123:
         return jjStopAtPos(0, 91);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x40L);
      case 125:
         return jjStopAtPos(0, 92);
      case 215:
         return jjStopAtPos(0, 56);
      case 247:
         return jjStopAtPos(0, 60);
      case 19981:
         return jjMoveStringLiteralDfa1_0(0x444000000L, 0x400002L);
      case 20026:
         return jjStartNfaWithStates_0(0, 76, 7);
      case 20056:
         return jjStartNfaWithStates_0(0, 55, 7);
      case 20551:
         jjmatchedKind = 10;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x10000L);
      case 20943:
         jjmatchedKind = 51;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4000000L);
      case 21152:
         jjmatchedKind = 47;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1000000L);
      case 21542:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x200000L);
      case 22823:
         return jjMoveStringLiteralDfa1_0(0x8000L, 0x0L);
      case 22914:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8000L);
      case 23567:
         return jjMoveStringLiteralDfa1_0(0x80000L, 0x0L);
      case 23569:
         return jjMoveStringLiteralDfa1_0(0x100000L, 0x0L);
      case 23601:
         return jjStartNfaWithStates_0(0, 83, 7);
      case 24182:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x10L);
      case 25110:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x80L);
      case 26159:
         return jjStartNfaWithStates_0(0, 23, 7);
      case 27491:
         return jjStartNfaWithStates_0(0, 48, 7);
      case 27809:
         return jjMoveStringLiteralDfa1_0(0x8000000L, 0x0L);
      case 30495:
         return jjStartNfaWithStates_0(0, 8, 7);
      case 31561:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x800L);
      case 33267:
         return jjMoveStringLiteralDfa1_0(0x80000000L, 0x0L);
      case 36127:
         return jjStartNfaWithStates_0(0, 52, 7);
      case 36229:
         return jjMoveStringLiteralDfa1_0(0x10000L, 0x0L);
      case 37027:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x40000L);
      case 38500:
         return jjStartNfaWithStates_0(0, 59, 7);
      case 65288:
         return jjStopAtPos(0, 36);
      case 65289:
         return jjStopAtPos(0, 38);
      case 65291:
         return jjStopAtPos(0, 49);
      case 65292:
         return jjStopAtPos(0, 42);
      case 65293:
         return jjStopAtPos(0, 53);
      case 65307:
         return jjStopAtPos(0, 40);
      case 65309:
         return jjStopAtPos(0, 77);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active1 & 0x8L) != 0L)
            return jjStopAtPos(1, 67);
         break;
      case 61:
         if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         else if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStopAtPos(1, 32);
         else if ((active1 & 0x800000L) != 0L)
            return jjStopAtPos(1, 87);
         else if ((active1 & 0x2000000L) != 0L)
            return jjStopAtPos(1, 89);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L, active1, 0L);
      case 101:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 7);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(1, 29, 7);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(1, 33, 7);
         break;
      case 102:
         if ((active1 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 78, 7);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x20000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000000000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x100000L);
      case 109:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x100L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0L, active1, 0x4L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000000000000L, active1, 0L);
      case 113:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(1, 22, 7);
         break;
      case 114:
         if ((active1 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(1, 69, 7);
         return jjMoveStringLiteralDfa2_0(active0, 0x80L, active1, 0L);
      case 116:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 7);
         else if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 18, 7);
         break;
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L, active1, 0L);
      case 124:
         if ((active1 & 0x40L) != 0L)
            return jjStopAtPos(1, 70);
         break;
      case 19978:
         if ((active1 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(1, 88, 7);
         break;
      case 19988:
         if ((active1 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(1, 68, 7);
         break;
      case 20040:
         if ((active1 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(1, 82, 7);
         break;
      case 20110:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 7);
         else if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(1, 19, 7);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(1, 20, 7);
         else if ((active1 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 75, 7);
         break;
      case 21017:
         if ((active1 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(1, 85, 7);
         break;
      case 21435:
         if ((active1 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(1, 90, 7);
         break;
      case 22823:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L, active1, 0L);
      case 22914:
         if ((active1 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 80, 7);
         break;
      case 23567:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L, active1, 0L);
      case 23569:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(1, 31, 7);
         break;
      case 26159:
         if ((active1 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(1, 65, 7);
         break;
      case 26524:
         if ((active1 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 79, 7);
         break;
      case 28982:
         if ((active1 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(1, 86, 7);
         break;
      case 31561:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000000L, active1, 0L);
      case 32773:
         if ((active1 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(1, 71, 7);
         break;
      case 36229:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L, active1, 0L);
      case 36807:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(1, 16, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, active1);
      return 2;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 62, 7);
         else if ((active1 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(2, 66, 7);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x20000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0xa00L, active1, 0L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x100L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0L, active1, 0x100000L);
      case 116:
         if ((active0 & 0x8000000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 63, 7);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L, active1, 0L);
      case 118:
         if ((active0 & 0x400000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 58, 7);
         break;
      case 20110:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 7);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 7);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 7);
         break;
      case 36807:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0, active1);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(1, old0, old1); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, active1);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 7);
         else if ((active1 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 84, 7);
         break;
      case 108:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 7);
         break;
      case 110:
         if ((active1 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 81, 7);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0L, active1, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, active1);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(2, old0, old1); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, active1);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(4, 9, 7);
         break;
      case 121:
         if ((active1 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 72, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, active1);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x1L, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec1 = {
   0x80L, 0x0L, 0x8000000000000000L, 0x0L
};
static final long[] jjbitVec2 = {
   0x0L, 0xaL, 0x0L, 0x0L
};
static final long[] jjbitVec3 = {
   0x0L, 0x4000000000000000L, 0x0L, 0x0L
};
static final long[] jjbitVec4 = {
   0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L
};
static final long[] jjbitVec6 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec7 = {
   0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec8 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec9 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec10 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec11 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec12 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 36;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 2)
                        kind = 2;
                     jjCheckNAddStates(0, 4);
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  else if ((0x1800000000L & l) != 0L)
                  {
                     if (kind > 93)
                        kind = 93;
                     jjCheckNAdd(7);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(5, 9);
                  else if (curChar == 34)
                     jjCheckNAddStates(10, 14);
                  else if (curChar == 46)
                     jjCheckNAdd(2);
                  break;
               case 1:
                  if (curChar == 46)
                     jjCheckNAdd(2);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddTwoStates(2, 3);
                  break;
               case 4:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(5);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAdd(5);
                  break;
               case 6:
                  if ((0x1800000000L & l) == 0L)
                     break;
                  if (kind > 93)
                     kind = 93;
                  jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 93)
                     kind = 93;
                  jjCheckNAdd(7);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAddStates(0, 4);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjCheckNAdd(9);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(10, 11);
                  break;
               case 11:
                  if (curChar != 46)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddTwoStates(12, 13);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddTwoStates(12, 13);
                  break;
               case 14:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAdd(15);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(16, 17);
                  break;
               case 18:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(19);
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAdd(19);
                  break;
               case 20:
                  if (curChar == 34)
                     jjCheckNAddStates(10, 14);
                  break;
               case 21:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddStates(15, 17);
                  break;
               case 23:
                  if (curChar == 34)
                     jjCheckNAddStates(15, 17);
                  break;
               case 24:
                  if (curChar == 34 && kind > 5)
                     kind = 5;
                  break;
               case 25:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(25, 26);
                  break;
               case 27:
                  if ((0xfffffffbffffffffL & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 28:
                  if (curChar == 39)
                     jjCheckNAddStates(5, 9);
                  break;
               case 29:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddStates(18, 20);
                  break;
               case 31:
                  if (curChar == 39)
                     jjCheckNAddStates(18, 20);
                  break;
               case 32:
                  if (curChar == 39 && kind > 5)
                     kind = 5;
                  break;
               case 33:
                  if ((0xffffff7fffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(33, 34);
                  break;
               case 35:
                  if ((0xffffff7fffffffffL & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 7:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 93)
                     kind = 93;
                  jjCheckNAdd(7);
                  break;
               case 3:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(21, 22);
                  break;
               case 13:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(23, 24);
                  break;
               case 17:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(25, 26);
                  break;
               case 21:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(15, 17);
                  break;
               case 22:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if (curChar == 92)
                     jjCheckNAddStates(15, 17);
                  break;
               case 25:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjAddStates(27, 28);
                  break;
               case 26:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
               case 35:
                  if ((0xffffffffefffffffL & l) != 0L && kind > 6)
                     kind = 6;
                  break;
               case 29:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(18, 20);
                  break;
               case 30:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 31:
                  if (curChar == 92)
                     jjCheckNAddStates(18, 20);
                  break;
               case 33:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjAddStates(29, 30);
                  break;
               case 34:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 1)
                        kind = 1;
                  }
                  if (jjCanMove_2(hiByte, i1, i2, l1, l2))
                  {
                     if (kind > 93)
                        kind = 93;
                     jjCheckNAdd(7);
                  }
                  break;
               case 2:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjAddStates(31, 32);
                  break;
               case 6:
               case 7:
                  if (!jjCanMove_2(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 93)
                     kind = 93;
                  jjCheckNAdd(7);
                  break;
               case 9:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 2)
                     kind = 2;
                  jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 12:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjAddStates(33, 34);
                  break;
               case 21:
                  if (jjCanMove_3(hiByte, i1, i2, l1, l2))
                     jjAddStates(15, 17);
                  break;
               case 25:
                  if (jjCanMove_3(hiByte, i1, i2, l1, l2))
                     jjAddStates(27, 28);
                  break;
               case 27:
               case 35:
                  if (jjCanMove_3(hiByte, i1, i2, l1, l2) && kind > 6)
                     kind = 6;
                  break;
               case 29:
                  if (jjCanMove_3(hiByte, i1, i2, l1, l2))
                     jjAddStates(18, 20);
                  break;
               case 33:
                  if (jjCanMove_3(hiByte, i1, i2, l1, l2))
                     jjAddStates(29, 30);
                  break;
               default : break;
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
      if ((i = jjnewStateCnt) == (startsAt = 36 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   9, 10, 11, 16, 17, 29, 30, 32, 33, 34, 21, 22, 24, 25, 26, 21, 
   22, 24, 29, 30, 32, 4, 5, 14, 15, 18, 19, 25, 26, 33, 34, 2, 
   3, 12, 13, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 48:
         return ((jjbitVec0[i2] & l2) != 0L);
      default : 
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 78:
         return ((jjbitVec1[i2] & l2) != 0L);
      case 83:
         return ((jjbitVec2[i2] & l2) != 0L);
      case 118:
         return ((jjbitVec3[i2] & l2) != 0L);
      default : 
         return false;
   }
}
private static final boolean jjCanMove_2(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 51:
         return ((jjbitVec9[i2] & l2) != 0L);
      case 61:
         return ((jjbitVec10[i2] & l2) != 0L);
      default : 
         if ((jjbitVec4[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_3(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec12[i2] & l2) != 0L);
      default : 
         if ((jjbitVec11[i1] & l1) != 0L)
            return true;
         return false;
   }
}
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\164\162\165\145", "\u771f", 
"\146\141\154\163\145", "\u5047", "\156\165\154\154", "\56", "\76", "\147\164", "\u5927\u4e8e", 
"\u8d85\u8fc7", "\74", "\154\164", "\u5c0f\u4e8e", "\u5c11\u4e8e", "\75\75", "\145\161", 
"\u662f", "\74\75", "\154\145", "\u4e0d\u5927\u4e8e", "\u6ca1\u8d85\u8fc7", "\76\75", 
"\147\145", "\u4e0d\u5c0f\u4e8e", "\u81f3\u5c11", "\41\75", "\156\145", 
"\u4e0d\u7b49\u4e8e", "\50", "\uff08", "\51", "\uff09", "\73", "\uff1b", "\54", "\uff0c", "\72", 
"\133", "\135", "\53", "\u52a0", "\u6b63", "\uff0b", "\55", "\u51cf", "\u8d1f", 
"\uff0d", "\52", "\u4e58", "\327", "\57", "\144\151\166", "\u9664", "\367", "\45", 
"\155\157\144", "\156\157\164", "\41", "\u4e0d\u662f", "\141\156\144", "\46\46", 
"\u5e76\u4e14", "\157\162", "\174\174", "\u6216\u8005", "\145\155\160\164\171", "\77", "\75", 
"\u7b49\u4e8e", "\u4e3a", "\uff1d", "\151\146", "\u5982\u679c", "\u5047\u5982", 
"\164\150\145\156", "\u90a3\u4e48", "\u5c31", "\145\154\163\145", "\u5426\u5219", "\u4e0d\u7136", 
"\53\75", "\u52a0\u4e0a", "\55\75", "\u51cf\u53bb", "\173", "\175", null, null, null, 
null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0xffffffffffffffedL, 0x23fffffffL, 
};
static final long[] jjtoSkip = {
   0x2L, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x2L, 0x0L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[36];
private final int[] jjstateSet = new int[72];
protected char curChar;
public ELParserTokenManager(SimpleCharStream stream)
{
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public ELParserTokenManager(SimpleCharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 36; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedPos == 0 && jjmatchedKind > 97)
   {
      jjmatchedKind = 97;
   }
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
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

}
