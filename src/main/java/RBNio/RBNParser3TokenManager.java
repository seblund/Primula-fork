/* Generated By:JavaCC: Do not edit this line. RBNParser3TokenManager.java */
package RBNio;
import RBNpackage.*;
import java.util.*;
import myio.StringOps;
import RBNExceptions.RBNSyntaxException;

/** Token Manager. */
public class RBNParser3TokenManager implements RBNParser3Constants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 40;
            return 35;
         }
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 40;
            return 22;
         }
         return -1;
      case 1:
         if ((active0 & 0x3000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 1;
            return 48;
         }
         return -1;
      case 2:
         if ((active0 & 0x3000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 2;
            return 48;
         }
         return -1;
      case 3:
         if ((active0 & 0x2000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 3;
            return 48;
         }
         if ((active0 & 0x1000000L) != 0L)
            return 48;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 35:
         return jjStopAtPos(0, 17);
      case 36:
         return jjStopAtPos(0, 18);
      case 37:
         return jjStopAtPos(0, 4);
      case 38:
         return jjStopAtPos(0, 23);
      case 40:
         return jjStopAtPos(0, 12);
      case 41:
         return jjStopAtPos(0, 13);
      case 42:
         return jjStopAtPos(0, 36);
      case 43:
         return jjStopAtPos(0, 37);
      case 44:
         return jjStopAtPos(0, 14);
      case 58:
         return jjStopAtPos(0, 19);
      case 59:
         return jjStopAtPos(0, 11);
      case 61:
         return jjStopAtPos(0, 10);
      case 64:
         return jjStopAtPos(0, 9);
      case 91:
         return jjStopAtPos(0, 15);
      case 93:
         return jjStopAtPos(0, 16);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 123:
         return jjStopAtPos(0, 20);
      case 124:
         return jjStopAtPos(0, 21);
      case 125:
         return jjStopAtPos(0, 22);
      case 126:
         return jjStopAtPos(0, 26);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 48);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
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
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 48);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 128;
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
               case 48:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(48);
                  break;
               case 22:
                  if ((0x3ff200000000000L & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(48);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 39)
                        kind = 39;
                     jjCheckNAddStates(0, 4);
                  }
                  else if ((0x2400L & l) != 0L)
                  {
                     if (kind > 3)
                        kind = 3;
                  }
                  else if (curChar == 46)
                     jjCheckNAdd(39);
                  else if (curChar == 45)
                     jjAddStates(5, 6);
                  if (curChar == 13)
                     jjAddStates(7, 8);
                  break;
               case 2:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 37:
                  if (curChar == 45)
                     jjAddStates(5, 6);
                  break;
               case 38:
                  if (curChar == 46)
                     jjCheckNAdd(39);
                  break;
               case 39:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(39);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAddStates(0, 4);
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(41);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(42, 43);
                  break;
               case 43:
                  if (curChar == 46)
                     jjCheckNAdd(44);
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  jjCheckNAdd(44);
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(45, 46);
                  break;
               case 46:
                  if (curChar == 46 && kind > 39)
                     kind = 39;
                  break;
               case 88:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 87;
                  break;
               case 91:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 90;
                  break;
               case 93:
                  if ((0x2400L & l) != 0L && kind > 3)
                     kind = 3;
                  break;
               case 94:
                  if (curChar == 13)
                     jjAddStates(7, 8);
                  break;
               case 95:
                  if (curChar == 10 && kind > 3)
                     kind = 3;
                  break;
               case 96:
                  if (curChar == 10 && kind > 27)
                     kind = 27;
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
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     jjCheckNAdd(48);
                  }
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 22:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     jjCheckNAdd(48);
                  }
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 40)
                        kind = 40;
                     jjCheckNAdd(48);
                  }
                  if (curChar == 87)
                     jjAddStates(9, 14);
                  else if (curChar == 119)
                     jjAddStates(15, 17);
                  else if (curChar == 101)
                     jjAddStates(18, 19);
                  else if (curChar == 108)
                     jjAddStates(20, 21);
                  else if (curChar == 84)
                     jjAddStates(22, 23);
                  else if (curChar == 69)
                     jjAddStates(24, 25);
                  else if (curChar == 67)
                     jjAddStates(26, 27);
                  else if (curChar == 70)
                     jjAddStates(28, 29);
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 35;
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 29;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 22;
                  else if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 18;
                  else if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  else if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if (curChar == 114 && kind > 28)
                     kind = 28;
                  break;
               case 1:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 4:
                  if (curChar == 110 && kind > 28)
                     kind = 28;
                  break;
               case 5:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 109 && kind > 28)
                     kind = 28;
                  break;
               case 9:
               case 14:
               case 98:
                  if (curChar == 117)
                     jjCheckNAdd(8);
                  break;
               case 10:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 118)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 15:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if (curChar == 100 && kind > 28)
                     kind = 28;
                  break;
               case 17:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 110 && kind > 30)
                     kind = 30;
                  break;
               case 21:
               case 82:
                  if (curChar == 101)
                     jjCheckNAdd(20);
                  break;
               case 23:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if (curChar == 101 && kind > 32)
                     kind = 32;
                  break;
               case 25:
               case 66:
                  if (curChar == 110)
                     jjCheckNAdd(24);
                  break;
               case 26:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 108 && kind > 34)
                     kind = 34;
                  break;
               case 32:
               case 55:
                  if (curChar == 108)
                     jjCheckNAdd(31);
                  break;
               case 33:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 34:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 33;
                  break;
               case 36:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 47:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(48);
                  break;
               case 48:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 40)
                     kind = 40;
                  jjCheckNAdd(48);
                  break;
               case 49:
                  if (curChar == 70)
                     jjAddStates(28, 29);
                  break;
               case 50:
                  if (curChar == 76 && kind > 34)
                     kind = 34;
                  break;
               case 51:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 52:
                  if (curChar == 65)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 53:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 52;
                  break;
               case 54:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 56:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 56;
                  break;
               case 58:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 59:
                  if (curChar == 67)
                     jjAddStates(26, 27);
                  break;
               case 60:
                  if (curChar == 69 && kind > 32)
                     kind = 32;
                  break;
               case 61:
                  if (curChar == 78)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 61;
                  break;
               case 63:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 62;
                  break;
               case 64:
                  if (curChar == 77)
                     jjstateSet[jjnewStateCnt++] = 63;
                  break;
               case 65:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 64;
                  break;
               case 67:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 68:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 67;
                  break;
               case 69:
                  if (curChar == 109)
                     jjstateSet[jjnewStateCnt++] = 68;
                  break;
               case 70:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 71:
                  if (curChar == 69)
                     jjAddStates(24, 25);
                  break;
               case 72:
                  if (curChar == 69 && kind > 31)
                     kind = 31;
                  break;
               case 73:
                  if (curChar == 83)
                     jjstateSet[jjnewStateCnt++] = 72;
                  break;
               case 74:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 73;
                  break;
               case 75:
                  if (curChar == 101 && kind > 31)
                     kind = 31;
                  break;
               case 76:
               case 100:
                  if (curChar == 115)
                     jjCheckNAdd(75);
                  break;
               case 77:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 76;
                  break;
               case 78:
                  if (curChar == 84)
                     jjAddStates(22, 23);
                  break;
               case 79:
                  if (curChar == 78 && kind > 30)
                     kind = 30;
                  break;
               case 80:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 79;
                  break;
               case 81:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 80;
                  break;
               case 83:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 82;
                  break;
               case 84:
                  if (curChar == 108)
                     jjAddStates(20, 21);
                  break;
               case 85:
                  if (curChar == 103 && kind > 28)
                     kind = 28;
                  break;
               case 86:
               case 89:
                  if (curChar == 101)
                     jjCheckNAdd(85);
                  break;
               case 87:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 86;
                  break;
               case 90:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 89;
                  break;
               case 92:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 91;
                  break;
               case 97:
                  if (curChar == 101)
                     jjAddStates(18, 19);
                  break;
               case 99:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 101:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 100;
                  break;
               case 102:
                  if (curChar == 119)
                     jjAddStates(15, 17);
                  break;
               case 103:
                  if (curChar == 102 && kind > 29)
                     kind = 29;
                  break;
               case 104:
               case 115:
                  if (curChar == 105)
                     jjCheckNAdd(103);
                  break;
               case 105:
                  if (curChar == 104 && kind > 33)
                     kind = 33;
                  break;
               case 106:
               case 119:
                  if (curChar == 116)
                     jjCheckNAdd(105);
                  break;
               case 107:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 106;
                  break;
               case 108:
                  if (curChar == 101 && kind > 35)
                     kind = 35;
                  break;
               case 109:
               case 125:
                  if (curChar == 114)
                     jjCheckNAdd(108);
                  break;
               case 110:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 109;
                  break;
               case 111:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 110;
                  break;
               case 112:
                  if (curChar == 87)
                     jjAddStates(9, 14);
                  break;
               case 113:
                  if (curChar == 70 && kind > 29)
                     kind = 29;
                  break;
               case 114:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 113;
                  break;
               case 116:
                  if (curChar == 72 && kind > 33)
                     kind = 33;
                  break;
               case 117:
                  if (curChar == 84)
                     jjstateSet[jjnewStateCnt++] = 116;
                  break;
               case 118:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 117;
                  break;
               case 120:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 119;
                  break;
               case 121:
                  if (curChar == 69 && kind > 35)
                     kind = 35;
                  break;
               case 122:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 121;
                  break;
               case 123:
                  if (curChar == 69)
                     jjstateSet[jjnewStateCnt++] = 122;
                  break;
               case 124:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 123;
                  break;
               case 126:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 125;
                  break;
               case 127:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 126;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
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
      if ((i = jjnewStateCnt) == (startsAt = 128 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 5);
      case 13:
         jjmatchedKind = 7;
         return jjMoveStringLiteralDfa1_1(0x40L);
      default :
         return 1;
   }
}
private int jjMoveStringLiteralDfa1_1(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         break;
      default :
         return 2;
   }
   return 2;
}
static final int[] jjnextStates = {
   41, 42, 43, 45, 46, 38, 40, 95, 96, 114, 115, 118, 120, 124, 127, 104, 
   107, 111, 99, 101, 88, 92, 81, 83, 74, 77, 65, 70, 54, 58, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\100", "\75", "\73", 
"\50", "\51", "\54", "\133", "\135", "\43", "\44", "\72", "\173", "\174", "\175", 
"\46", "\164\162\165\145", "\146\141\154\163\145", "\176", null, null, null, null, 
null, null, null, null, null, "\52", "\53", null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "WithinComment",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, 1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x1bffffffe01L, 
};
static final long[] jjtoSkip = {
   0xfeL, 
};
static final long[] jjtoMore = {
   0x100L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[128];
private final int[] jjstateSet = new int[256];
protected char curChar;
/** Constructor. */
public RBNParser3TokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public RBNParser3TokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 128; i-- > 0;)
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
   if (lexState >= 2 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
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
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100000200L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
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

}
