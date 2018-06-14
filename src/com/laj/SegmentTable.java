package com.laj;

import java.util.ArrayList;

public class SegmentTable {

    private int segmentNum;      //段号
    private int segmentLength;  //段长
    private boolean ioFlag;     //内外存标识符
    private int pageTableAddress;   //页表起始地址

    public SegmentTable(){
    }

    public SegmentTable(int segmentNum, int segmentLength, boolean ioFlag, int pageTableAddress){
        this.segmentNum = segmentNum;
        this.segmentLength = segmentLength;
        this.ioFlag = ioFlag;
        this.pageTableAddress = pageTableAddress;
    }

    public void setSegmentNum(int segmentNum) {
        this.segmentNum = segmentNum;
    }

    public int getSegmentNum() {
        return segmentNum;
    }

    public void setSegmentLength(int segmentLength) {
        this.segmentLength = segmentLength;
    }

    public int getSegmentLength() {
        return segmentLength;
    }

    public void setIoFlag(boolean ioFlag) {
        this.ioFlag = ioFlag;
    }

    public boolean isIoFlag() {
        return ioFlag;
    }

    public void setPageTableAddress(int pageTableAddress) {
        this.pageTableAddress = pageTableAddress;
    }

    public int getPageTableAddress() {
        return pageTableAddress;
    }

    @Override
    public String toString() {
        return segmentNum + " " + segmentLength + " " + ioFlag + " " + pageTableAddress + "\n";
    }
}
