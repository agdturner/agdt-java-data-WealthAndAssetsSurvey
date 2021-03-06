/**
 * Source code generated by uk.ac.leeds.ccg.data.waascg.process.WaASCG_Main
 */

package uk.ac.leeds.ccg.data.waas.data.hhold;
import uk.ac.leeds.ccg.data.waas.data.id.WaAS_RecordID;

public class WaAS_W5HRecord extends WaAS_W4W5HRecord {

    protected short CASEW5;

    protected boolean DVHASCAR;

    protected boolean DVHASMOTB;

    protected boolean DVHASVAN;

    protected int DVTOTCARVANMOTBVAL;

    protected int DVTOTGIR_3SF;

    protected boolean EQTYPE2_I;

    protected boolean EQTYPE2_IFLAG;

    protected boolean EQTYPE3;

    protected boolean EQTYPE4;

    protected boolean EQTYPE5;

    protected boolean EQTYPE6;

    protected boolean EQTYPE7;

    protected boolean EQTYPE8;

    protected boolean EQTYPE9;

    protected byte GOR;

    protected boolean MENDV10_I;

    protected boolean MENDV10_IFLAG;

    protected int MENDV11_I;

    protected boolean MENDV11_IFLAG;

    protected boolean MENDVB8;

    protected boolean MENDY8;

    protected byte MINTFIX1;

    protected byte MINTFIX2;

    protected byte MINTFIX3;

    protected byte MINTPAID1;

    protected byte MINTPAID2;

    protected byte MINTPAID3;

    protected double MINTRATE1;

    protected double MINTRATE2;

    protected double MINTRATE3;

    protected int MNEG3_I;

    protected boolean MNEG3_IFLAG;

    protected byte MONTHW4;

    protected byte MPASTSPA1;

    protected byte MPASTSPA2;

    protected byte MPASTSPA3;

    protected byte MYPASTSPA1;

    protected byte MYPASTSPA2;

    protected byte MYPASTSPA3;

    protected byte NUMADISW;

    protected int VESTVTOTAL;

    protected byte VESTVTOTALB;

    protected byte VESTVTOTALB_I;

    protected boolean VESTVTOTALB_IFLAG;

    protected int VESTVTOTAL_I;

    protected boolean VESTVTOTAL_IFLAG;

    protected boolean VOTYP_IFLAG;

    protected byte VOVLB_I;

    protected boolean VOVLB_IFLAG;

    protected byte VTYPE1_I;

    protected byte VTYPE3;

    protected byte VTYPE3_I;

    protected double W5XSHHWGT;

    protected short YEARW4;

    protected final void initCASEW5(String s) {
        if (!s.trim().isEmpty()) {
            CASEW5 = Short.parseShort(s);
        } else {
            CASEW5 = Short.MIN_VALUE;
        }
    }

    protected final void initDVHASCAR(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                DVHASCAR = false;
            } else {
                DVHASCAR = true;
            }
        }
    }

    protected final void initDVHASMOTB(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                DVHASMOTB = false;
            } else {
                DVHASMOTB = true;
            }
        }
    }

    protected final void initDVHASVAN(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                DVHASVAN = false;
            } else {
                DVHASVAN = true;
            }
        }
    }

    protected final void initDVTOTCARVANMOTBVAL(String s) {
        if (!s.trim().isEmpty()) {
            DVTOTCARVANMOTBVAL = Integer.parseInt(s);
        } else {
            DVTOTCARVANMOTBVAL = Integer.MIN_VALUE;
        }
    }

    protected final void initDVTOTGIR_3SF(String s) {
        if (!s.trim().isEmpty()) {
            DVTOTGIR_3SF = Integer.parseInt(s);
        } else {
            DVTOTGIR_3SF = Integer.MIN_VALUE;
        }
    }

    protected final void initEQTYPE2_I(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                EQTYPE2_I = false;
            } else {
                EQTYPE2_I = true;
            }
        }
    }

    protected final void initEQTYPE2_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                EQTYPE2_IFLAG = false;
            } else {
                EQTYPE2_IFLAG = true;
            }
        }
    }

    protected final void initEQTYPE3(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                EQTYPE3 = false;
            } else {
                EQTYPE3 = true;
            }
        }
    }

    protected final void initEQTYPE4(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                EQTYPE4 = false;
            } else {
                EQTYPE4 = true;
            }
        }
    }

    protected final void initEQTYPE5(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                EQTYPE5 = false;
            } else {
                EQTYPE5 = true;
            }
        }
    }

    protected final void initEQTYPE6(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                EQTYPE6 = false;
            } else {
                EQTYPE6 = true;
            }
        }
    }

    protected final void initEQTYPE7(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                EQTYPE7 = false;
            } else {
                EQTYPE7 = true;
            }
        }
    }

    protected final void initEQTYPE8(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                EQTYPE8 = false;
            } else {
                EQTYPE8 = true;
            }
        }
    }

    protected final void initEQTYPE9(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                EQTYPE9 = false;
            } else {
                EQTYPE9 = true;
            }
        }
    }

    protected final void initGOR(String s) {
        if (!s.trim().isEmpty()) {
            GOR = Byte.parseByte(s);
        } else {
            GOR = Byte.MIN_VALUE;
        }
    }

    protected final void initMENDV10_I(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MENDV10_I = false;
            } else {
                MENDV10_I = true;
            }
        }
    }

    protected final void initMENDV10_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                MENDV10_IFLAG = false;
            } else {
                MENDV10_IFLAG = true;
            }
        }
    }

    protected final void initMENDV11_I(String s) {
        if (!s.trim().isEmpty()) {
            MENDV11_I = Integer.parseInt(s);
        } else {
            MENDV11_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMENDV11_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                MENDV11_IFLAG = false;
            } else {
                MENDV11_IFLAG = true;
            }
        }
    }

    protected final void initMENDVB8(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MENDVB8 = false;
            } else {
                MENDVB8 = true;
            }
        }
    }

    protected final void initMENDY8(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == -7) {
                MENDY8 = false;
            } else {
                MENDY8 = true;
            }
        }
    }

    protected final void initMINTFIX1(String s) {
        if (!s.trim().isEmpty()) {
            MINTFIX1 = Byte.parseByte(s);
        } else {
            MINTFIX1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINTFIX2(String s) {
        if (!s.trim().isEmpty()) {
            MINTFIX2 = Byte.parseByte(s);
        } else {
            MINTFIX2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINTFIX3(String s) {
        if (!s.trim().isEmpty()) {
            MINTFIX3 = Byte.parseByte(s);
        } else {
            MINTFIX3 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINTPAID1(String s) {
        if (!s.trim().isEmpty()) {
            MINTPAID1 = Byte.parseByte(s);
        } else {
            MINTPAID1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINTPAID2(String s) {
        if (!s.trim().isEmpty()) {
            MINTPAID2 = Byte.parseByte(s);
        } else {
            MINTPAID2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINTPAID3(String s) {
        if (!s.trim().isEmpty()) {
            MINTPAID3 = Byte.parseByte(s);
        } else {
            MINTPAID3 = Byte.MIN_VALUE;
        }
    }

    protected final void initMINTRATE1(String s) {
        if (!s.trim().isEmpty()) {
            MINTRATE1 = Double.parseDouble(s);
        } else {
            MINTRATE1 = Double.NaN;
        }
    }

    protected final void initMINTRATE2(String s) {
        if (!s.trim().isEmpty()) {
            MINTRATE2 = Double.parseDouble(s);
        } else {
            MINTRATE2 = Double.NaN;
        }
    }

    protected final void initMINTRATE3(String s) {
        if (!s.trim().isEmpty()) {
            MINTRATE3 = Double.parseDouble(s);
        } else {
            MINTRATE3 = Double.NaN;
        }
    }

    protected final void initMNEG3_I(String s) {
        if (!s.trim().isEmpty()) {
            MNEG3_I = Integer.parseInt(s);
        } else {
            MNEG3_I = Integer.MIN_VALUE;
        }
    }

    protected final void initMNEG3_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                MNEG3_IFLAG = false;
            } else {
                MNEG3_IFLAG = true;
            }
        }
    }

    protected final void initMONTHW4(String s) {
        if (!s.trim().isEmpty()) {
            MONTHW4 = Byte.parseByte(s);
        } else {
            MONTHW4 = Byte.MIN_VALUE;
        }
    }

    protected final void initMPASTSPA1(String s) {
        if (!s.trim().isEmpty()) {
            MPASTSPA1 = Byte.parseByte(s);
        } else {
            MPASTSPA1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMPASTSPA2(String s) {
        if (!s.trim().isEmpty()) {
            MPASTSPA2 = Byte.parseByte(s);
        } else {
            MPASTSPA2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMPASTSPA3(String s) {
        if (!s.trim().isEmpty()) {
            MPASTSPA3 = Byte.parseByte(s);
        } else {
            MPASTSPA3 = Byte.MIN_VALUE;
        }
    }

    protected final void initMYPASTSPA1(String s) {
        if (!s.trim().isEmpty()) {
            MYPASTSPA1 = Byte.parseByte(s);
        } else {
            MYPASTSPA1 = Byte.MIN_VALUE;
        }
    }

    protected final void initMYPASTSPA2(String s) {
        if (!s.trim().isEmpty()) {
            MYPASTSPA2 = Byte.parseByte(s);
        } else {
            MYPASTSPA2 = Byte.MIN_VALUE;
        }
    }

    protected final void initMYPASTSPA3(String s) {
        if (!s.trim().isEmpty()) {
            MYPASTSPA3 = Byte.parseByte(s);
        } else {
            MYPASTSPA3 = Byte.MIN_VALUE;
        }
    }

    protected final void initNUMADISW(String s) {
        if (!s.trim().isEmpty()) {
            NUMADISW = Byte.parseByte(s);
        } else {
            NUMADISW = Byte.MIN_VALUE;
        }
    }

    protected final void initVESTVTOTAL(String s) {
        if (!s.trim().isEmpty()) {
            VESTVTOTAL = Integer.parseInt(s);
        } else {
            VESTVTOTAL = Integer.MIN_VALUE;
        }
    }

    protected final void initVESTVTOTALB(String s) {
        if (!s.trim().isEmpty()) {
            VESTVTOTALB = Byte.parseByte(s);
        } else {
            VESTVTOTALB = Byte.MIN_VALUE;
        }
    }

    protected final void initVESTVTOTALB_I(String s) {
        if (!s.trim().isEmpty()) {
            VESTVTOTALB_I = Byte.parseByte(s);
        } else {
            VESTVTOTALB_I = Byte.MIN_VALUE;
        }
    }

    protected final void initVESTVTOTALB_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                VESTVTOTALB_IFLAG = false;
            } else {
                VESTVTOTALB_IFLAG = true;
            }
        }
    }

    protected final void initVESTVTOTAL_I(String s) {
        if (!s.trim().isEmpty()) {
            VESTVTOTAL_I = Integer.parseInt(s);
        } else {
            VESTVTOTAL_I = Integer.MIN_VALUE;
        }
    }

    protected final void initVESTVTOTAL_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                VESTVTOTAL_IFLAG = false;
            } else {
                VESTVTOTAL_IFLAG = true;
            }
        }
    }

    protected final void initVOTYP_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                VOTYP_IFLAG = false;
            } else {
                VOTYP_IFLAG = true;
            }
        }
    }

    protected final void initVOVLB_I(String s) {
        if (!s.trim().isEmpty()) {
            VOVLB_I = Byte.parseByte(s);
        } else {
            VOVLB_I = Byte.MIN_VALUE;
        }
    }

    protected final void initVOVLB_IFLAG(String s) {
        if (!s.trim().isEmpty()) {
            byte b = Byte.parseByte(s);
            if (b == 0) {
                VOVLB_IFLAG = false;
            } else {
                VOVLB_IFLAG = true;
            }
        }
    }

    protected final void initVTYPE1_I(String s) {
        if (!s.trim().isEmpty()) {
            VTYPE1_I = Byte.parseByte(s);
        } else {
            VTYPE1_I = Byte.MIN_VALUE;
        }
    }

    protected final void initVTYPE3(String s) {
        if (!s.trim().isEmpty()) {
            VTYPE3 = Byte.parseByte(s);
        } else {
            VTYPE3 = Byte.MIN_VALUE;
        }
    }

    protected final void initVTYPE3_I(String s) {
        if (!s.trim().isEmpty()) {
            VTYPE3_I = Byte.parseByte(s);
        } else {
            VTYPE3_I = Byte.MIN_VALUE;
        }
    }

    protected final void initW5XSHHWGT(String s) {
        if (!s.trim().isEmpty()) {
            W5XSHHWGT = Double.parseDouble(s);
        } else {
            W5XSHHWGT = Double.NaN;
        }
    }

    protected final void initYEARW4(String s) {
        if (!s.trim().isEmpty()) {
            YEARW4 = Short.parseShort(s);
        } else {
            YEARW4 = Short.MIN_VALUE;
        }
    }

    public short getCASEW5() {
        return CASEW5;
    }

    public boolean getDVHASCAR() {
        return DVHASCAR;
    }

    public boolean getDVHASMOTB() {
        return DVHASMOTB;
    }

    public boolean getDVHASVAN() {
        return DVHASVAN;
    }

    public int getDVTOTCARVANMOTBVAL() {
        return DVTOTCARVANMOTBVAL;
    }

    public int getDVTOTGIR_3SF() {
        return DVTOTGIR_3SF;
    }

    public boolean getEQTYPE2_I() {
        return EQTYPE2_I;
    }

    public boolean getEQTYPE2_IFLAG() {
        return EQTYPE2_IFLAG;
    }

    public boolean getEQTYPE3() {
        return EQTYPE3;
    }

    public boolean getEQTYPE4() {
        return EQTYPE4;
    }

    public boolean getEQTYPE5() {
        return EQTYPE5;
    }

    public boolean getEQTYPE6() {
        return EQTYPE6;
    }

    public boolean getEQTYPE7() {
        return EQTYPE7;
    }

    public boolean getEQTYPE8() {
        return EQTYPE8;
    }

    public boolean getEQTYPE9() {
        return EQTYPE9;
    }

    public byte getGOR() {
        return GOR;
    }

    public boolean getMENDV10_I() {
        return MENDV10_I;
    }

    public boolean getMENDV10_IFLAG() {
        return MENDV10_IFLAG;
    }

    public int getMENDV11_I() {
        return MENDV11_I;
    }

    public boolean getMENDV11_IFLAG() {
        return MENDV11_IFLAG;
    }

    public boolean getMENDVB8() {
        return MENDVB8;
    }

    public boolean getMENDY8() {
        return MENDY8;
    }

    public byte getMINTFIX1() {
        return MINTFIX1;
    }

    public byte getMINTFIX2() {
        return MINTFIX2;
    }

    public byte getMINTFIX3() {
        return MINTFIX3;
    }

    public byte getMINTPAID1() {
        return MINTPAID1;
    }

    public byte getMINTPAID2() {
        return MINTPAID2;
    }

    public byte getMINTPAID3() {
        return MINTPAID3;
    }

    public double getMINTRATE1() {
        return MINTRATE1;
    }

    public double getMINTRATE2() {
        return MINTRATE2;
    }

    public double getMINTRATE3() {
        return MINTRATE3;
    }

    public int getMNEG3_I() {
        return MNEG3_I;
    }

    public boolean getMNEG3_IFLAG() {
        return MNEG3_IFLAG;
    }

    public byte getMONTHW4() {
        return MONTHW4;
    }

    public byte getMPASTSPA1() {
        return MPASTSPA1;
    }

    public byte getMPASTSPA2() {
        return MPASTSPA2;
    }

    public byte getMPASTSPA3() {
        return MPASTSPA3;
    }

    public byte getMYPASTSPA1() {
        return MYPASTSPA1;
    }

    public byte getMYPASTSPA2() {
        return MYPASTSPA2;
    }

    public byte getMYPASTSPA3() {
        return MYPASTSPA3;
    }

    public byte getNUMADISW() {
        return NUMADISW;
    }

    public int getVESTVTOTAL() {
        return VESTVTOTAL;
    }

    public byte getVESTVTOTALB() {
        return VESTVTOTALB;
    }

    public byte getVESTVTOTALB_I() {
        return VESTVTOTALB_I;
    }

    public boolean getVESTVTOTALB_IFLAG() {
        return VESTVTOTALB_IFLAG;
    }

    public int getVESTVTOTAL_I() {
        return VESTVTOTAL_I;
    }

    public boolean getVESTVTOTAL_IFLAG() {
        return VESTVTOTAL_IFLAG;
    }

    public boolean getVOTYP_IFLAG() {
        return VOTYP_IFLAG;
    }

    public byte getVOVLB_I() {
        return VOVLB_I;
    }

    public boolean getVOVLB_IFLAG() {
        return VOVLB_IFLAG;
    }

    public byte getVTYPE1_I() {
        return VTYPE1_I;
    }

    public byte getVTYPE3() {
        return VTYPE3;
    }

    public byte getVTYPE3_I() {
        return VTYPE3_I;
    }

    public double getW5XSHHWGT() {
        return W5XSHHWGT;
    }

    public short getYEARW4() {
        return YEARW4;
    }


    public WaAS_W5HRecord(WaAS_RecordID i, String line) throws Exception {
        super(i);
        s = line.split("\t");
        initCASEW5(s[0]);
        initYEAR(s[1]);
        initMONTH(s[2]);
        initCASEW4(s[3]);
        initYEARW4(s[4]);
        initMONTHW4(s[5]);
        initCASEW3(s[6]);
        initYEARW3(s[7]);
        initMONTHW3(s[8]);
        initCASEW2(s[9]);
        initYEARW2(s[10]);
        initMONTHW2(s[11]);
        initCASEW1(s[12]);
        initYEARW1(s[13]);
        initMONTHW1(s[14]);
        initHOUT(s[15]);
        initW5XSHHWGT(s[16]);
        initACCOM(s[17]);
        initFLTTYP(s[18]);
        initACCOTH(s[19]);
        initTEN1(s[20]);
        initTIED(s[21]);
        initLLORD(s[22]);
        initFURN(s[23]);
        initDVPRIRNT(s[24]);
        initHHOWN(s[25]);
        initHAGEB(s[26]);
        initHAGEYR(s[27]);
        initHBUYYR(s[28]);
        initHBUYSE(s[29]);
        initHSHARE(s[30]);
        initHSHAREP(s[31]);
        initHPRICE(s[32]);
        initHPRICEB(s[33]);
        initHBFROM(s[34]);
        initHRTBEV(s[35]);
        initHHOSCH(s[36]);
        initHVALUE(s[37]);
        initHVALB(s[38]);
        initHEXT1(s[39]);
        initHEXT2(s[40]);
        initHEXT3(s[41]);
        initHEXT4(s[42]);
        initMNUMBN(s[43]);
        initMNUMB(s[44]);
        initMW2CHK1(s[45]);
        initMW2CHK2(s[46]);
        initMW2CHK3(s[47]);
        initMEXTN(s[48]);
        initMEXTRS1(s[49]);
        initMEXTRS2(s[50]);
        initMEXTRS3(s[51]);
        initMCHGE(s[52]);
        initMCHGENUM(s[53]);
        initMNUMBO(s[54]);
        initMNAME1(s[55]);
        initMONAME1(s[56]);
        initMJNAME01(s[57]);
        initMJNAME02(s[58]);
        initMJNAME03(s[59]);
        initMJNAME04(s[60]);
        initMREAS01(s[61]);
        initMREAS02(s[62]);
        initMREAS03(s[63]);
        initMREAS04(s[64]);
        initMREAS05(s[65]);
        initMREAS06(s[66]);
        initMREAS07(s[67]);
        initMTYPE1(s[68]);
        initMENDW1(s[69]);
        initMENDNUM1(s[70]);
        initMALL1(s[71]);
        initMALLTY1(s[72]);
        initMVAL1(s[73]);
        initMVALB1(s[74]);
        initMNEG1(s[75]);
        initMNEGB1(s[76]);
        initMENDV1(s[77]);
        initMENDVB1(s[78]);
        initMENDY1(s[79]);
        initMENDV2(s[80]);
        initMENDVB2(s[81]);
        initMENDY2(s[82]);
        initMENDV3(s[83]);
        initMENDVB3(s[84]);
        initMENDY3(s[85]);
        initMENDV4(s[86]);
        initMENDVB4(s[87]);
        initMENDY4(s[88]);
        initMENDV5(s[89]);
        initMENDX1(s[90]);
        initMINVW1(s[91]);
        initMINVW2(s[92]);
        initMINVW3(s[93]);
        initMPOLICY1(s[94]);
        initMPOLICY2(s[95]);
        initMYLFT1(s[96]);
        initMYIFCH1(s[97]);
        initMINTPAID1(s[98]);
        initMINTFIX1(s[99]);
        initMINTRATE1(s[100]);
        initMPAYM1(s[101]);
        initMPAYB1(s[102]);
        initMPASTSPA1(s[103]);
        initMYPASTSPA1(s[104]);
        initMINC1(s[105]);
        initMINC2(s[106]);
        initMINC3(s[107]);
        initMINC4(s[108]);
        initMINC5(s[109]);
        initMPP1(s[110]);
        initMHOWPY1(s[111]);
        initMARRS1(s[112]);
        initMARRSV1(s[113]);
        initMARR2YR1(s[114]);
        initMARR2YR2(s[115]);
        initMARR2YR3(s[116]);
        initMARRCL01(s[117]);
        initMARRCL02(s[118]);
        initMARRCL12(s[119]);
        initDBURDH(s[120]);
        initMNAME2(s[121]);
        initMONAME2(s[122]);
        initMJNAME18(s[123]);
        initMJNAME19(s[124]);
        initMJNAME20(s[125]);
        initMREAS12(s[126]);
        initMREAS13(s[127]);
        initMREAS14(s[128]);
        initMTYPE2(s[129]);
        initBRIDLN1(s[130]);
        initBRIDLN2(s[131]);
        initBRIDLN3(s[132]);
        initMENDW2(s[133]);
        initMENDNUM2(s[134]);
        initMALL2(s[135]);
        initMALLTY2(s[136]);
        initMVAL2(s[137]);
        initMVALB2(s[138]);
        initMNEG2(s[139]);
        initMNEGB2(s[140]);
        initMENDV6(s[141]);
        initMENDVB6(s[142]);
        initMENDY6(s[143]);
        initMENDV7(s[144]);
        initMENDVB7(s[145]);
        initMENDY7(s[146]);
        initMENDV8(s[147]);
        initMENDVB8(s[148]);
        initMENDY8(s[149]);
        initMENDX2(s[150]);
        initMYLFT2(s[151]);
        initMYIFCH2(s[152]);
        initMPASTSPA2(s[153]);
        initMYPASTSPA2(s[154]);
        initMPAYM2(s[155]);
        initMPAYB2(s[156]);
        initMINC6(s[157]);
        initMPP2(s[158]);
        initMINTPAID2(s[159]);
        initMINTFIX2(s[160]);
        initMINTRATE2(s[161]);
        initMHOWPY2(s[162]);
        initMARRS2(s[163]);
        initMARRSV2(s[164]);
        initMNAME3(s[165]);
        initMONAME3(s[166]);
        initMJNAME35(s[167]);
        initMJNAME36(s[168]);
        initMREAS23(s[169]);
        initMREAS24(s[170]);
        initMTYPE3(s[171]);
        initMENDW3(s[172]);
        initMENDNUM3(s[173]);
        initMALL3(s[174]);
        initMALLTY3(s[175]);
        initMVAL3(s[176]);
        initMVALB3(s[177]);
        initMNEG3(s[178]);
        initMNEGB3(s[179]);
        initMENDV11(s[180]);
        initMENDVB11(s[181]);
        initMENDY11(s[182]);
        initMENDX3(s[183]);
        initMYLFT3(s[184]);
        initMYIFCH3(s[185]);
        initMPASTSPA3(s[186]);
        initMYPASTSPA3(s[187]);
        initMPAYM3(s[188]);
        initMPAYB3(s[189]);
        initMINC11(s[190]);
        initMPP3(s[191]);
        initMINTPAID3(s[192]);
        initMINTFIX3(s[193]);
        initMINTRATE3(s[194]);
        initMHOWPY3(s[195]);
        initMARRS3(s[196]);
        initMARRSV3(s[197]);
        initEQOLD(s[198]);
        initEQNEW(s[199]);
        initEQYES(s[200]);
        initEQTYPE1(s[201]);
        initEQTYPE2(s[202]);
        initEQTYPE3(s[203]);
        initEQTYPE4(s[204]);
        initEQTYPE5(s[205]);
        initEQTYPE6(s[206]);
        initEQTYPE7(s[207]);
        initEQTYPE8(s[208]);
        initEQTYPE9(s[209]);
        initEQWHENY(s[210]);
        initEQWHENM(s[211]);
        initEQDRAW(s[212]);
        initEQVAL(s[213]);
        initEQVALB(s[214]);
        initEQVALDR(s[215]);
        initEQVALDRB(s[216]);
        initEREC(s[217]);
        initERECMPD(s[218]);
        initERECMBY(s[219]);
        initERECTAX(s[220]);
        initEINT(s[221]);
        initEINTFIX(s[222]);
        initEINTRAT(s[223]);
        initEMSPAY(s[224]);
        initEMSARR(s[225]);
        initFRREPFIX(s[226]);
        initSHARAPP(s[227]);
        initESHARAPP(s[228]);
        initERVREG1(s[229]);
        initERVREG2(s[230]);
        initERVSUM(s[231]);
        initERVSUMB(s[232]);
        initERVRECPD(s[233]);
        initERVRECBY(s[234]);
        initERVTAX(s[235]);
        initERVRENT(s[236]);
        initERVPRP(s[237]);
        initEPRVPAY(s[238]);
        initEPRVAL(s[239]);
        initEPRPER(s[240]);
        initEOTHREG(s[241]);
        initEOTHRVA(s[242]);
        initEOTHRVB(s[243]);
        initPRREPAY(s[244]);
        initPRREPFIX(s[245]);
        initPRREPPC(s[246]);
        initGCOLLEC(s[247]);
        initGCOLLV(s[248]);
        initGCOLLVB(s[249]);
        initGCONTVB(s[250]);
        initVCARN(s[251]);
        initVTYPE1(s[252]);
        initVTYPE2(s[253]);
        initVTYPE3(s[254]);
        initVPERS(s[255]);
        initVPERV(s[256]);
        initVOTYP1(s[257]);
        initVOTYP2(s[258]);
        initVOTYP3(s[259]);
        initVOTYP4(s[260]);
        initVOTPN(s[261]);
        initVOVAL(s[262]);
        initVOVLB(s[263]);
        initVCARN_I(s[264]);
        initVCARN_IFLAG(s[265]);
        initVESTVTOTAL(s[266]);
        initVESTVTOTALB(s[267]);
        initVESTVTOTALB_I(s[268]);
        initVESTVTOTALB_IFLAG(s[269]);
        initVESTVTOTAL_I(s[270]);
        initVESTVTOTAL_IFLAG(s[271]);
        initVTYPE_IFLAG(s[272]);
        initVOTYP_IFLAG(s[273]);
        initVOVLB_I(s[274]);
        initVOVLB_IFLAG(s[275]);
        initMNUMB_I(s[276]);
        initMNUMB_IFLAG(s[277]);
        initMALL1_I(s[278]);
        initMALL1_IFLAG(s[279]);
        initMALL2_I(s[280]);
        initMALL2_IFLAG(s[281]);
        initMALL3_I(s[282]);
        initMALL3_IFLAG(s[283]);
        initMALLTY1_I(s[284]);
        initMALLTY1_IFLAG(s[285]);
        initMALLTY2_I(s[286]);
        initMALLTY2_IFLAG(s[287]);
        initMVAL1_I(s[288]);
        initMVAL1_IFLAG(s[289]);
        initMVAL2_I(s[290]);
        initMVAL2_IFLAG(s[291]);
        initMVAL3_I(s[292]);
        initMVAL3_IFLAG(s[293]);
        initMNEG1_I(s[294]);
        initMNEG1_IFLAG(s[295]);
        initMNEG2_I(s[296]);
        initMNEG2_IFLAG(s[297]);
        initMNEG3_I(s[298]);
        initMNEG3_IFLAG(s[299]);
        initTEN1_I(s[300]);
        initTEN1_IFLAG(s[301]);
        initHSHARE_I(s[302]);
        initHSHARE_IFLAG(s[303]);
        initHSHAREP_I(s[304]);
        initHSHAREP_IFLAG(s[305]);
        initEQUITY_YN_I(s[306]);
        initEQUITY_YN_IFLAG(s[307]);
        initEQTYPE1_I(s[308]);
        initEQTYPE1_IFLAG(s[309]);
        initEQTYPE2_I(s[310]);
        initEQTYPE2_IFLAG(s[311]);
        initEQDRAW_I(s[312]);
        initEQDRAW_IFLAG(s[313]);
        initEQVALB_I(s[314]);
        initEQVALB_IFLAG(s[315]);
        initEQVAL_I(s[316]);
        initEQVAL_IFLAG(s[317]);
        initEINT_I(s[318]);
        initEINT_IFLAG(s[319]);
        initEINTRAT_I(s[320]);
        initEINTRAT_IFLAG(s[321]);
        initERVPRP_I(s[322]);
        initERVPRP_IFLAG(s[323]);
        initPRREPAY_I(s[324]);
        initPRREPAY_IFLAG(s[325]);
        initPRREPFIX_I(s[326]);
        initPRREPFIX_IFLAG(s[327]);
        initPRREPPC_I(s[328]);
        initPRREPPC_IFLAG(s[329]);
        initMTYPE1_I(s[330]);
        initMTYPE1_IFLAG(s[331]);
        initMTYPE2_I(s[332]);
        initMTYPE2_IFLAG(s[333]);
        initMTYPE3_I(s[334]);
        initMTYPE3_IFLAG(s[335]);
        initMENDW1_I(s[336]);
        initMENDW1_IFLAG(s[337]);
        initMENDW2_I(s[338]);
        initMENDW2_IFLAG(s[339]);
        initMENDW3_I(s[340]);
        initMENDW3_IFLAG(s[341]);
        initMENDNUM1_I(s[342]);
        initMENDNUM1_IFLAG(s[343]);
        initMENDNUM2_I(s[344]);
        initMENDNUM2_IFLAG(s[345]);
        initMENDNUM3_I(s[346]);
        initMENDNUM3_IFLAG(s[347]);
        initMENDVB1_I(s[348]);
        initMENDVB1_IFLAG(s[349]);
        initMENDVB2_I(s[350]);
        initMENDVB2_IFLAG(s[351]);
        initMENDVB3_I(s[352]);
        initMENDVB3_IFLAG(s[353]);
        initMENDVB4_I(s[354]);
        initMENDVB4_IFLAG(s[355]);
        initMENDVB5_I(s[356]);
        initMENDVB5_IFLAG(s[357]);
        initMENDVB9_I(s[358]);
        initMENDVB9_IFLAG(s[359]);
        initMENDVB6_I(s[360]);
        initMENDVB6_IFLAG(s[361]);
        initMENDVB7_I(s[362]);
        initMENDVB7_IFLAG(s[363]);
        initMENDVB8_I(s[364]);
        initMENDVB8_IFLAG(s[365]);
        initMENDVB11_I(s[366]);
        initMENDVB11_IFLAG(s[367]);
        initMENDV1_I(s[368]);
        initMENDV1_IFLAG(s[369]);
        initMENDV2_I(s[370]);
        initMENDV2_IFLAG(s[371]);
        initMENDV3_I(s[372]);
        initMENDV3_IFLAG(s[373]);
        initMENDV4_I(s[374]);
        initMENDV4_IFLAG(s[375]);
        initMENDV5_I(s[376]);
        initMENDV5_IFLAG(s[377]);
        initMENDV6_I(s[378]);
        initMENDV6_IFLAG(s[379]);
        initMENDV7_I(s[380]);
        initMENDV7_IFLAG(s[381]);
        initMENDV10_I(s[382]);
        initMENDV10_IFLAG(s[383]);
        initMENDV11_I(s[384]);
        initMENDV11_IFLAG(s[385]);
        initHVALUE_I(s[386]);
        initHVALUE_IFLAG(s[387]);
        initDVHVALUE(s[388]);
        initTOTMVAL(s[389]);
        initTOTMNEG(s[390]);
        initTOTMORT(s[391]);
        initDVEQRELVAL(s[392]);
        initDVEQLTM(s[393]);
        initDVHORP(s[394]);
        initDVEQSRB(s[395]);
        initDVEQPRUN(s[396]);
        initHMORTG(s[397]);
        initALLENDW(s[398]);
        initHSETYPE(s[399]);
        initVTYPE1_I(s[400]);
        initVTYPE2_I(s[401]);
        initVTYPE3_I(s[402]);
        initVPERS_I(s[403]);
        initVPERS_IFLAG(s[404]);
        initVPERV_I(s[405]);
        initVPERV_IFLAG(s[406]);
        initVOTYP1_I(s[407]);
        initVOTYP2_I(s[408]);
        initVOTYP3_I(s[409]);
        initVOTYP4_I(s[410]);
        initVOTYP5_I(s[411]);
        initVOVAL_I(s[412]);
        initVOVAL_IFLAG(s[413]);
        initGCOLLEC_I(s[414]);
        initGCOLLEC_IFLAG(s[415]);
        initGCOLLV_I(s[416]);
        initGCOLLV_IFLAG(s[417]);
        initGCONTVB_I(s[418]);
        initGCONTVB_IFLAG(s[419]);
        initDVHSEVAL_SUM(s[420]);
        initDVBLTVAL_SUM(s[421]);
        initDVBLDVAL_SUM(s[422]);
        initDVLUKVAL_SUM(s[423]);
        initDVLOSVAL_SUM(s[424]);
        initDVOPRVAL_SUM(s[425]);
        initDVHSEDEBT_SUM(s[426]);
        initDVBLTDEBT_SUM(s[427]);
        initDVBLDDEBT_SUM(s[428]);
        initDVLUKDEBT_SUM(s[429]);
        initDVLOSDEBT_SUM(s[430]);
        initDVOPRDEBT_SUM(s[431]);
        initOTHMORT_SUM(s[432]);
        initHOUSGDST_SUM(s[433]);
        initBUYLGDST_SUM(s[434]);
        initHOUSGDSOST_SUM(s[435]);
        initPHYSHOUSGDST_AGGR(s[436]);
        initPHYSBUYLGDST_AGGR(s[437]);
        initPHYSHOUSGDSOST_AGGR(s[438]);
        initGCONTVLS(s[439]);
        initDVGCOLLV(s[440]);
        initALLGD(s[441]);
        initDVHASCAR(s[442]);
        initDVHASVAN(s[443]);
        initDVHASMOTB(s[444]);
        initDVTOTOTHVEHVAL(s[445]);
        initDVTOTPERNPVAL(s[446]);
        initDVTOTCARVANMOTBVAL(s[447]);
        initDVTOTVEHVAL(s[448]);
        initHPHYSW(s[449]);
        initDVPROPERTY(s[450]);
        initHPROPW(s[451]);
        initDVCISAV_AGGR(s[452]);
        initDVIISAV_AGGR(s[453]);
        initDVKISAV_AGGR(s[454]);
        initDVFNSVAL_AGGR(s[455]);
        initDVFSHUKV_AGGR(s[456]);
        initDVINSV_AGGR(s[457]);
        initDVFLFENV_AGGR(s[458]);
        initDVFLFSIV_AGGR(s[459]);
        initDVFLFFSV_AGGR(s[460]);
        initDVFLFTEV_AGGR(s[461]);
        initDVFBONDV_AGGR(s[462]);
        initDVFESHARES_AGGR(s[463]);
        initDVFESHAV_AGGR(s[464]);
        initDVFEOPTV_AGGR(s[465]);
        initDVFCOLLV_AGGR(s[466]);
        initDVFSHOSV_AGGR(s[467]);
        initDVFGLTUKV_AGGR(s[468]);
        initDVFGLTFOV_AGGR(s[469]);
        initDVFINVOTV_AGGR(s[470]);
        initDVFINFVAL_AGGR(s[471]);
        initDVFINFLV_AGGR(s[472]);
        initDVFINFV_AGGR(s[473]);
        initDVISAVAL_AGGR(s[474]);
        initDVFFASSETS_AGGR(s[475]);
        initDVCACTV_AGGR(s[476]);
        initDVCASVV_AGGR(s[477]);
        initDVCAVAL_AGGR(s[478]);
        initDVCACRVAL_AGGR(s[479]);
        initDVCAODVAL_AGGR(s[480]);
        initDVSAVAL_AGGR(s[481]);
        initTOTCC_AGGR(s[482]);
        initTOTSC_AGGR(s[483]);
        initTOTMO_AGGR(s[484]);
        initTOTNSLBNK_AGGR(s[485]);
        initTOTNSLC_AGGR(s[486]);
        initTOTOSLBNK_AGGR(s[487]);
        initTOTOSLC_AGGR(s[488]);
        initTOTSLBNK_AGGR(s[489]);
        initTOTSLC_AGGR(s[490]);
        initTOTBILLARR_AGGR(s[491]);
        initTOTHPARR_AGGR(s[492]);
        initTOTMOARR_AGGR(s[493]);
        initTOTLNARR_AGGR(s[494]);
        initTOTDVNWFLN_AGGR(s[495]);
        initTOTDVNWILN_AGGR(s[496]);
        initTOTARR_EXCMORT_AGGR(s[497]);
        initHFINW_EXCENDW_AGGR(s[498]);
        initHFINW_SUM(s[499]);
        initDVVALDBT_AGGR(s[500]);
        initDVVALDCOS_AGGR(s[501]);
        initDVPAVCUV_AGGR(s[502]);
        initDVPFDDV_AGGR(s[503]);
        initDVPPVAL_AGGR(s[504]);
        initTOTLOS_AGGR(s[505]);
        initTOTNLOS_AGGR(s[506]);
        initTOTFLNS_AGGR(s[507]);
        initTOTHP_AGGR(s[508]);
        initTOTLNS_AGGR(s[509]);
        initHFINL_AGGR(s[510]);
        initHFINWNT_SUM(s[511]);
        initDVSPEN_AGGR(s[512]);
        initDVPINPVAL_AGGR(s[513]);
        initDVDBRWEALTHVAL_AGGR(s[514]);
        initTOTPEN_AGGR(s[515]);
        initTOTWLTH(s[516]);
        initDVPFCURVAL_AGGR(s[517]);
        initDVTOTGIR(s[518]);
        initDVNIOTHI_AGGR(s[519]);
        initHRPDVAGE(s[520]);
        initHRPDVAGE9(s[521]);
        initHRPSEX(s[522]);
        initHRPNSSEC3(s[523]);
        initHRPDVILO3A(s[524]);
        initHRPDVMRDF(s[525]);
        initHRPEDATTN1(s[526]);
        initHRPEDATTN2(s[527]);
        initHRPEDATTN3(s[528]);
        initHRPDVECACT(s[529]);
        initHRPIOUT1(s[530]);
        initHRPPARTIOUT1(s[531]);
        initOFINAL(s[532]);
        initNOUNITS(s[533]);
        initDVHSIZE(s[534]);
        initGOR(s[535]);
        initNUMADISW(s[536]);
        initNUMADULT(s[537]);
        initNUMCH18(s[538]);
        initNUMCHILD(s[539]);
        initNUMCIVPTR(s[540]);
        initNUMCPART(s[541]);
        initNUMDEPCH(s[542]);
        initNUMELCH(s[543]);
        initNUMHHLDR(s[544]);
        initNUMMPART(s[545]);
        initNUMNOELCH(s[546]);
        initHHOLDTYPE(s[547]);
        initHRPEDLEVEL(s[548]);
        initHHPPHYS(s[549]);
        initHHOWNF(s[550]);
        initPHVAL(s[551]);
        initPMVAL(s[552]);
        initPEVAL(s[553]);
        initHBEDRM(s[554]);
        initDVTOTNIR(s[555]);
        initDVTOTGIR_3SF(s[556]);
        initDVGISE_AGGR(s[557]);
        initDVGIPPEN_AGGR(s[558]);
        initDVGIEMP_AGGR(s[559]);
        initDVBENEFITANNUAL_AGGR(s[560]);
        initDVGIINV_AGGR(s[561]);
        initDVGRSRENTAMTANNUAL_AGGR(s[562]);
        initDVNISE_AGGR(s[563]);
        initDVNIPPEN_AGGR(s[564]);
        initDVNIEMP_AGGR(s[565]);
        initDVNIINV_AGGR(s[566]);
        initDVNETRENTAMTANNUAL_AGGR(s[567]);
        initDVOINRRANNUAL_AGGR(s[568]);
        initDVOINGTANNUAL_AGGR(s[569]);
        initDVOINEGANNUAL_AGGR(s[570]);
        initDVOINFRANNUAL_AGGR(s[571]);
        initDVOINMAANNUAL_AGGR(s[572]);
        initDVOINROANNUAL_AGGR(s[573]);
        initDVOINOPANNUAL_AGGR(s[574]);
        initDVOIGRRANNUAL_AGGR(s[575]);
        initDVOIGGTANNUAL_AGGR(s[576]);
        initDVOIGEGANNUAL_AGGR(s[577]);
        initDVOIGFRANNUAL_AGGR(s[578]);
        initDVOIGMAANNUAL_AGGR(s[579]);
        initDVOIGROANNUAL_AGGR(s[580]);
        initDVOIGOPANNUAL_AGGR(s[581]);
        initDVGIOTHR_AGGR(s[582]);
        initDVNIOTHR_AGGR(s[583]);
        initDVERECNETANNUAL(s[584]);
        initDVERVRECNETANNUAL(s[585]);
        initDVERECGROSSANNUAL(s[586]);
        initDVERVRECGROSSANNUAL(s[587]);
    }

    @Override
    public WaAS_RecordID getID() {
        return (WaAS_RecordID) id;
    }
}
