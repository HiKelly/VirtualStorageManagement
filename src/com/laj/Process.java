package com.laj;

import java.util.ArrayList;

public class Process {

    private int num;    //段的个数
    private ArrayList<Integer> segmentSize = new ArrayList<Integer>();    //各段多大
    private SegmentTable segmentTable = new SegmentTable();    //段表
    private PageTable pageTable = new PageTable();  //页表

    public Process(int num){
        this.num = num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setSegmentSize(ArrayList<Integer> segmentSize) {
        this.segmentSize = segmentSize;
    }

    public ArrayList<Integer> getSegmentSize() {
        return segmentSize;
    }

    public void setSegmentTable(SegmentTable segmentTable) {
        this.segmentTable = segmentTable;
    }

    public SegmentTable getSegmentTable() {
        return segmentTable;
    }

    public void setPageTable(PageTable pageTable) {
        this.pageTable = pageTable;
    }

    public PageTable getPageTable() {
        return pageTable;
    }

    @Override
    public String toString() {
        return this.segmentTable.toString() + this.pageTable.toString();
    }
}
