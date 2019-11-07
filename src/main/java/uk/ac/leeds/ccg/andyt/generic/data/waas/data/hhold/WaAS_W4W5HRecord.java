/**
 * Source code generated by uk.ac.leeds.ccg.andyt.generic.data.waascg.process.WaASCG_Main
 */

package uk.ac.leeds.ccg.andyt.generic.data.waas.data.hhold;
import uk.ac.leeds.ccg.andyt.generic.data.waas.data.id.WaAS_RecordID;
import uk.ac.leeds.ccg.andyt.data.Data_Record;

public abstract class WaAS_W4W5HRecord extends WaAS_W3W4W5HRecord {


    WaAS_W4W5HRecord(WaAS_RecordID i){
        super(i);
    }
    protected boolean BRIDLN1;

    protected boolean BRIDLN2;

    protected boolean BRIDLN3;

    protected short CASEW4;

    protected byte DBURDH;

    protected int DVBENEFITANNUAL_AGGR;

    protected byte EQVALB_I;

    protected boolean EQVALB_IFLAG;

    protected byte HRPDVAGE;

    protected byte HRPDVECACT;

    protected byte HRPIOUT1;

    protected byte HRPPARTIOUT1;

    protected byte MALL1;

    protected byte MALL1_I;

    protected boolean MALL1_IFLAG;

    protected byte MALLTY1;

    protected byte MALLTY1_I;

    protected boolean MALLTY1_IFLAG;

    protected byte MARR2YR1;

    protected byte MARR2YR2;

    protected byte MARR2YR3;

    protected byte MARRCL01;

    protected byte MARRCL02;

    protected byte MARRCL12;

    protected byte MARRS1;

    protected short MARRSV1;

    protected byte MENDNUM1;

    protected byte MENDNUM1_I;

    protected boolean MENDNUM1_IFLAG;

    protected int MENDV1;

    protected int MENDV1_I;

    protected boolean MENDV1_IFLAG;

    protected byte MENDVB1;

    protected boolean MENDVB11_I;

    protected boolean MENDVB11_IFLAG;

    protected byte MENDVB1_I;

    protected boolean MENDVB1_IFLAG;

    protected byte MENDVB2_I;

    protected boolean MENDVB2_IFLAG;

    protected byte MENDVB3_I;

    protected boolean MENDVB3_IFLAG;

    protected byte MENDVB4_I;

    protected boolean MENDVB4_IFLAG;

    protected boolean MENDVB5_I;

    protected boolean MENDVB5_IFLAG;

    protected byte MENDVB6_I;

    protected boolean MENDVB6_IFLAG;

    protected byte MENDVB7_I;

    protected boolean MENDVB7_IFLAG;

    protected boolean MENDVB8_I;

    protected boolean MENDVB8_IFLAG;

    protected boolean MENDVB9_I;

    protected boolean MENDVB9_IFLAG;

    protected byte MENDW1;

    protected byte MENDW1_I;

    protected boolean MENDW1_IFLAG;

    protected byte MENDW3;

    protected byte MENDX1;

    protected byte MENDY1;

    protected byte MHOWPY1;

    protected byte MINVW1;

    protected byte MINVW2;

    protected byte MINVW3;

    protected byte MNAME1;

    protected int MNEG1;

    protected int MNEG1_I;

    protected boolean MNEG1_IFLAG;

    protected byte MNEGB1;

    protected byte MONAME1;

    protected byte MONTHW3;

    protected byte MPAYB1;

    protected int MPAYM1;

    protected byte MPOLICY1;

    protected byte MPOLICY2;

    protected byte MPP1;

    protected byte MTYPE1;

    protected byte MTYPE1_I;

    protected boolean MTYPE1_IFLAG;

    protected int MVAL1;

    protected int MVAL1_I;

    protected boolean MVAL1_IFLAG;

    protected byte MVALB1;

    protected byte MYIFCH1;

    protected byte MYLFT1;

    protected byte VTYPE1;

    protected short YEARW3;

    protected final void initBRIDLN1(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            BRIDLN1 = false;
        }
    }

    protected final void initBRIDLN2(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            BRIDLN2 = false;
        }
    }

    protected final void initBRIDLN3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            BRIDLN3 = false;
        }
    }

    protected final void initCASEW4(String s) {
        if (!s.trim().isEmpty()) {
            CASEW4 = Short.parseShort(s);
        } else {
            CASEW4 = Short.MIN_VALUE;
        }
    }

    protected final void initDBURDH(String s) {
        if (!s.trim().isEmpty()) {
            DBURDH = Byte.parseByte(s);
        } else {
            DBURDH = Byte.MIN_VALUE;
        }
    }

    protected final void initDVBENEFITANNUAL_AGGR(String s) {
        if (!s.trim().isEmpty()) {
            DVBENEFITANNUAL_AGGR = Integer.parseInt(s);
        } else {
            DVBENEFITANNUAL_AGGR = Integer.MIN_VALUE;
        }
    }

    protected final void initEQVALB_I(String s) {
        if (!s.trim().isEmpty()) {
            EQVALB_I = Byte.parseByte(s);
        } else {
            EQVALB_I = Byte.MIN_VALUE;
        }
    }

    protected final void initEQVALB_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            EQVALB_IFLAG = false;
        }
    }

    protected final void initHRPDVAGE(String s) {
        if (!s.trim().isEmpty()) {
            HRPDVAGE = Byte.parseByte(s);
        } else {
            HRPDVAGE = Byte.MIN_VALUE;
        }
    }

    protected final void initHRPDVECACT(String s) {
        if (!s.trim().isEmpty()) {
            HRPDVECACT = Byte.parseByte(s);
        } else {
            HRPDVECACT = Byte.MIN_VALUE;
        }
    }

    protected final void initHRPIOUT1(String s) {
        if (!s.trim().isEmpty()) {
            HRPIOUT1 = Byte.parseByte(s);
        } else {
            HRPIOUT1 = Byte.MIN_VALUE;
        }
    }

    protected final void initHRPPARTIOUT1(String s) {
        if (!s.trim().isEmpty()) {
            HRPPARTIOUT1 = Byte.parseByte(s);
        } else {
            HRPPARTIOUT1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMALL1(String s) {
        if (!s.trim().isEmpty()) {
            MALL1 = Byte.parseByte(s);
        } else {
            MALL1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMALL1_I(String s) {
        if (!s.trim().isEmpty()) {
            MALL1_I = Byte.parseByte(s);
        } else {
            MALL1_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMALL1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MALL1_IFLAG = false;
        }
    }

    protected final void initMALLTY1(String s) {
        if (!s.trim().isEmpty()) {
            MALLTY1 = Byte.parseByte(s);
        } else {
            MALLTY1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMALLTY1_I(String s) {
        if (!s.trim().isEmpty()) {
            MALLTY1_I = Byte.parseByte(s);
        } else {
            MALLTY1_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMALLTY1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MALLTY1_IFLAG = false;
        }
    }

    protected final void initMARR2YR1(String s) {
        if (!s.trim().isEmpty()) {
            MARR2YR1 = Byte.parseByte(s);
        } else {
            MARR2YR1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMARR2YR2(String s) {
        if (!s.trim().isEmpty()) {
            MARR2YR2 = Byte.parseByte(s);
        } else {
            MARR2YR2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMARR2YR3(String s) {
        if (!s.trim().isEmpty()) {
            MARR2YR3 = Byte.parseByte(s);
        } else {
            MARR2YR3 = Byte.MIN_VALUE;
        }
    }

    protected final void initMARRCL01(String s) {
        if (!s.trim().isEmpty()) {
            MARRCL01 = Byte.parseByte(s);
        } else {
            MARRCL01 = Byte.MIN_VALUE;
        }
    }

    protected final void initMARRCL02(String s) {
        if (!s.trim().isEmpty()) {
            MARRCL02 = Byte.parseByte(s);
        } else {
            MARRCL02 = Byte.MIN_VALUE;
        }
    }

    protected final void initMARRCL12(String s) {
        if (!s.trim().isEmpty()) {
            MARRCL12 = Byte.parseByte(s);
        } else {
            MARRCL12 = Byte.MIN_VALUE;
        }
    }

    protected final void initMARRS1(String s) {
        if (!s.trim().isEmpty()) {
            MARRS1 = Byte.parseByte(s);
        } else {
            MARRS1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMARRSV1(String s) {
        if (!s.trim().isEmpty()) {
            MARRSV1 = Short.parseShort(s);
        } else {
            MARRSV1 = Short.MIN_VALUE;
        }
    }

    protected final void initMENDNUM1(String s) {
        if (!s.trim().isEmpty()) {
            MENDNUM1 = Byte.parseByte(s);
        } else {
            MENDNUM1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDNUM1_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDNUM1_I = Byte.parseByte(s);
        } else {
            MENDNUM1_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDNUM1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDNUM1_IFLAG = false;
        }
    }

    protected final void initMENDV1(String s) {
        if (!s.trim().isEmpty()) {
            MENDV1 = Integer.parseInt(s);
        } else {
            MENDV1 = Integer.MIN_VALUE;
        }
    }

    protected final void initMENDV1_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDV1_I = Integer.parseInt(s);
        } else {
            MENDV1_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMENDV1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDV1_IFLAG = false;
        }
    }

    protected final void initMENDVB1(String s) {
        if (!s.trim().isEmpty()) {
            MENDVB1 = Byte.parseByte(s);
        } else {
            MENDVB1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDVB11_I(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB11_I = false;
        }
    }

    protected final void initMENDVB11_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB11_IFLAG = false;
        }
    }

    protected final void initMENDVB1_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDVB1_I = Byte.parseByte(s);
        } else {
            MENDVB1_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDVB1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB1_IFLAG = false;
        }
    }

    protected final void initMENDVB2_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDVB2_I = Byte.parseByte(s);
        } else {
            MENDVB2_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDVB2_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB2_IFLAG = false;
        }
    }

    protected final void initMENDVB3_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDVB3_I = Byte.parseByte(s);
        } else {
            MENDVB3_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDVB3_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB3_IFLAG = false;
        }
    }

    protected final void initMENDVB4_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDVB4_I = Byte.parseByte(s);
        } else {
            MENDVB4_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDVB4_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB4_IFLAG = false;
        }
    }

    protected final void initMENDVB5_I(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB5_I = false;
        }
    }

    protected final void initMENDVB5_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB5_IFLAG = false;
        }
    }

    protected final void initMENDVB6_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDVB6_I = Byte.parseByte(s);
        } else {
            MENDVB6_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDVB6_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB6_IFLAG = false;
        }
    }

    protected final void initMENDVB7_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDVB7_I = Byte.parseByte(s);
        } else {
            MENDVB7_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDVB7_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB7_IFLAG = false;
        }
    }

    protected final void initMENDVB8_I(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB8_I = false;
        }
    }

    protected final void initMENDVB8_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB8_IFLAG = false;
        }
    }

    protected final void initMENDVB9_I(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB9_I = false;
        }
    }

    protected final void initMENDVB9_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDVB9_IFLAG = false;
        }
    }

    protected final void initMENDW1(String s) {
        if (!s.trim().isEmpty()) {
            MENDW1 = Byte.parseByte(s);
        } else {
            MENDW1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDW1_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDW1_I = Byte.parseByte(s);
        } else {
            MENDW1_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDW1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MENDW1_IFLAG = false;
        }
    }

    protected final void initMENDW3(String s) {
        if (!s.trim().isEmpty()) {
            MENDW3 = Byte.parseByte(s);
        } else {
            MENDW3 = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDX1(String s) {
        if (!s.trim().isEmpty()) {
            MENDX1 = Byte.parseByte(s);
        } else {
            MENDX1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDY1(String s) {
        if (!s.trim().isEmpty()) {
            MENDY1 = Byte.parseByte(s);
        } else {
            MENDY1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMHOWPY1(String s) {
        if (!s.trim().isEmpty()) {
            MHOWPY1 = Byte.parseByte(s);
        } else {
            MHOWPY1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINVW1(String s) {
        if (!s.trim().isEmpty()) {
            MINVW1 = Byte.parseByte(s);
        } else {
            MINVW1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINVW2(String s) {
        if (!s.trim().isEmpty()) {
            MINVW2 = Byte.parseByte(s);
        } else {
            MINVW2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINVW3(String s) {
        if (!s.trim().isEmpty()) {
            MINVW3 = Byte.parseByte(s);
        } else {
            MINVW3 = Byte.MIN_VALUE;
        }
    }

    protected final void initMNAME1(String s) {
        if (!s.trim().isEmpty()) {
            MNAME1 = Byte.parseByte(s);
        } else {
            MNAME1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMNEG1(String s) {
        if (!s.trim().isEmpty()) {
            MNEG1 = Integer.parseInt(s);
        } else {
            MNEG1 = Integer.MIN_VALUE;
        }
    }

    protected final void initMNEG1_I(String s) {
        if (!s.trim().isEmpty()) {
            MNEG1_I = Integer.parseInt(s);
        } else {
            MNEG1_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMNEG1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MNEG1_IFLAG = false;
        }
    }

    protected final void initMNEGB1(String s) {
        if (!s.trim().isEmpty()) {
            MNEGB1 = Byte.parseByte(s);
        } else {
            MNEGB1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMONAME1(String s) {
        if (!s.trim().isEmpty()) {
            MONAME1 = Byte.parseByte(s);
        } else {
            MONAME1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMONTHW3(String s) {
        if (!s.trim().isEmpty()) {
            MONTHW3 = Byte.parseByte(s);
        } else {
            MONTHW3 = Byte.MIN_VALUE;
        }
    }

    protected final void initMPAYB1(String s) {
        if (!s.trim().isEmpty()) {
            MPAYB1 = Byte.parseByte(s);
        } else {
            MPAYB1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMPAYM1(String s) {
        if (!s.trim().isEmpty()) {
            MPAYM1 = Integer.parseInt(s);
        } else {
            MPAYM1 = Integer.MIN_VALUE;
        }
    }

    protected final void initMPOLICY1(String s) {
        if (!s.trim().isEmpty()) {
            MPOLICY1 = Byte.parseByte(s);
        } else {
            MPOLICY1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMPOLICY2(String s) {
        if (!s.trim().isEmpty()) {
            MPOLICY2 = Byte.parseByte(s);
        } else {
            MPOLICY2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMPP1(String s) {
        if (!s.trim().isEmpty()) {
            MPP1 = Byte.parseByte(s);
        } else {
            MPP1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMTYPE1(String s) {
        if (!s.trim().isEmpty()) {
            MTYPE1 = Byte.parseByte(s);
        } else {
            MTYPE1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMTYPE1_I(String s) {
        if (!s.trim().isEmpty()) {
            MTYPE1_I = Byte.parseByte(s);
        } else {
            MTYPE1_I = Byte.MIN_VALUE;
        }
    }

    protected final void initMTYPE1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MTYPE1_IFLAG = false;
        }
    }

    protected final void initMVAL1(String s) {
        if (!s.trim().isEmpty()) {
            MVAL1 = Integer.parseInt(s);
        } else {
            MVAL1 = Integer.MIN_VALUE;
        }
    }

    protected final void initMVAL1_I(String s) {
        if (!s.trim().isEmpty()) {
            MVAL1_I = Integer.parseInt(s);
        } else {
            MVAL1_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMVAL1_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            MVAL1_IFLAG = false;
        }
    }

    protected final void initMVALB1(String s) {
        if (!s.trim().isEmpty()) {
            MVALB1 = Byte.parseByte(s);
        } else {
            MVALB1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMYIFCH1(String s) {
        if (!s.trim().isEmpty()) {
            MYIFCH1 = Byte.parseByte(s);
        } else {
            MYIFCH1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMYLFT1(String s) {
        if (!s.trim().isEmpty()) {
            MYLFT1 = Byte.parseByte(s);
        } else {
            MYLFT1 = Byte.MIN_VALUE;
        }
    }

    protected final void initVTYPE1(String s) {
        if (!s.trim().isEmpty()) {
            VTYPE1 = Byte.parseByte(s);
        } else {
            VTYPE1 = Byte.MIN_VALUE;
        }
    }

    protected final void initYEARW3(String s) {
        if (!s.trim().isEmpty()) {
            YEARW3 = Short.parseShort(s);
        } else {
            YEARW3 = Short.MIN_VALUE;
        }
    }

    public boolean getBRIDLN1() {
        return BRIDLN1;
    }

    public boolean getBRIDLN2() {
        return BRIDLN2;
    }

    public boolean getBRIDLN3() {
        return BRIDLN3;
    }

    public short getCASEW4() {
        return CASEW4;
    }

    public byte getDBURDH() {
        return DBURDH;
    }

    public int getDVBENEFITANNUAL_AGGR() {
        return DVBENEFITANNUAL_AGGR;
    }

    public byte getEQVALB_I() {
        return EQVALB_I;
    }

    public boolean getEQVALB_IFLAG() {
        return EQVALB_IFLAG;
    }

    public byte getHRPDVAGE() {
        return HRPDVAGE;
    }

    public byte getHRPDVECACT() {
        return HRPDVECACT;
    }

    public byte getHRPIOUT1() {
        return HRPIOUT1;
    }

    public byte getHRPPARTIOUT1() {
        return HRPPARTIOUT1;
    }

    public byte getMALL1() {
        return MALL1;
    }

    public byte getMALL1_I() {
        return MALL1_I;
    }

    public boolean getMALL1_IFLAG() {
        return MALL1_IFLAG;
    }

    public byte getMALLTY1() {
        return MALLTY1;
    }

    public byte getMALLTY1_I() {
        return MALLTY1_I;
    }

    public boolean getMALLTY1_IFLAG() {
        return MALLTY1_IFLAG;
    }

    public byte getMARR2YR1() {
        return MARR2YR1;
    }

    public byte getMARR2YR2() {
        return MARR2YR2;
    }

    public byte getMARR2YR3() {
        return MARR2YR3;
    }

    public byte getMARRCL01() {
        return MARRCL01;
    }

    public byte getMARRCL02() {
        return MARRCL02;
    }

    public byte getMARRCL12() {
        return MARRCL12;
    }

    public byte getMARRS1() {
        return MARRS1;
    }

    public short getMARRSV1() {
        return MARRSV1;
    }

    public byte getMENDNUM1() {
        return MENDNUM1;
    }

    public byte getMENDNUM1_I() {
        return MENDNUM1_I;
    }

    public boolean getMENDNUM1_IFLAG() {
        return MENDNUM1_IFLAG;
    }

    public int getMENDV1() {
        return MENDV1;
    }

    public int getMENDV1_I() {
        return MENDV1_I;
    }

    public boolean getMENDV1_IFLAG() {
        return MENDV1_IFLAG;
    }

    public byte getMENDVB1() {
        return MENDVB1;
    }

    public boolean getMENDVB11_I() {
        return MENDVB11_I;
    }

    public boolean getMENDVB11_IFLAG() {
        return MENDVB11_IFLAG;
    }

    public byte getMENDVB1_I() {
        return MENDVB1_I;
    }

    public boolean getMENDVB1_IFLAG() {
        return MENDVB1_IFLAG;
    }

    public byte getMENDVB2_I() {
        return MENDVB2_I;
    }

    public boolean getMENDVB2_IFLAG() {
        return MENDVB2_IFLAG;
    }

    public byte getMENDVB3_I() {
        return MENDVB3_I;
    }

    public boolean getMENDVB3_IFLAG() {
        return MENDVB3_IFLAG;
    }

    public byte getMENDVB4_I() {
        return MENDVB4_I;
    }

    public boolean getMENDVB4_IFLAG() {
        return MENDVB4_IFLAG;
    }

    public boolean getMENDVB5_I() {
        return MENDVB5_I;
    }

    public boolean getMENDVB5_IFLAG() {
        return MENDVB5_IFLAG;
    }

    public byte getMENDVB6_I() {
        return MENDVB6_I;
    }

    public boolean getMENDVB6_IFLAG() {
        return MENDVB6_IFLAG;
    }

    public byte getMENDVB7_I() {
        return MENDVB7_I;
    }

    public boolean getMENDVB7_IFLAG() {
        return MENDVB7_IFLAG;
    }

    public boolean getMENDVB8_I() {
        return MENDVB8_I;
    }

    public boolean getMENDVB8_IFLAG() {
        return MENDVB8_IFLAG;
    }

    public boolean getMENDVB9_I() {
        return MENDVB9_I;
    }

    public boolean getMENDVB9_IFLAG() {
        return MENDVB9_IFLAG;
    }

    public byte getMENDW1() {
        return MENDW1;
    }

    public byte getMENDW1_I() {
        return MENDW1_I;
    }

    public boolean getMENDW1_IFLAG() {
        return MENDW1_IFLAG;
    }

    public byte getMENDW3() {
        return MENDW3;
    }

    public byte getMENDX1() {
        return MENDX1;
    }

    public byte getMENDY1() {
        return MENDY1;
    }

    public byte getMHOWPY1() {
        return MHOWPY1;
    }

    public byte getMINVW1() {
        return MINVW1;
    }

    public byte getMINVW2() {
        return MINVW2;
    }

    public byte getMINVW3() {
        return MINVW3;
    }

    public byte getMNAME1() {
        return MNAME1;
    }

    public int getMNEG1() {
        return MNEG1;
    }

    public int getMNEG1_I() {
        return MNEG1_I;
    }

    public boolean getMNEG1_IFLAG() {
        return MNEG1_IFLAG;
    }

    public byte getMNEGB1() {
        return MNEGB1;
    }

    public byte getMONAME1() {
        return MONAME1;
    }

    public byte getMONTHW3() {
        return MONTHW3;
    }

    public byte getMPAYB1() {
        return MPAYB1;
    }

    public int getMPAYM1() {
        return MPAYM1;
    }

    public byte getMPOLICY1() {
        return MPOLICY1;
    }

    public byte getMPOLICY2() {
        return MPOLICY2;
    }

    public byte getMPP1() {
        return MPP1;
    }

    public byte getMTYPE1() {
        return MTYPE1;
    }

    public byte getMTYPE1_I() {
        return MTYPE1_I;
    }

    public boolean getMTYPE1_IFLAG() {
        return MTYPE1_IFLAG;
    }

    public int getMVAL1() {
        return MVAL1;
    }

    public int getMVAL1_I() {
        return MVAL1_I;
    }

    public boolean getMVAL1_IFLAG() {
        return MVAL1_IFLAG;
    }

    public byte getMVALB1() {
        return MVALB1;
    }

    public byte getMYIFCH1() {
        return MYIFCH1;
    }

    public byte getMYLFT1() {
        return MYLFT1;
    }

    public byte getVTYPE1() {
        return VTYPE1;
    }

    public short getYEARW3() {
        return YEARW3;
    }

}
