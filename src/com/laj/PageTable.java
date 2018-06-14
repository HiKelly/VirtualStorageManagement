package com.laj;

public class PageTable {

    private int pageNum;    //页号
    private int memPageNum; //页面号
    private boolean pageFlag;   //标记内存是否在使用中

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setMemPageNum(int memPageNum) {
        this.memPageNum = memPageNum;
    }

    public int getMemPageNum() {
        return memPageNum;
    }

    public void setPageFlag(boolean pageFlag) {
        this.pageFlag = pageFlag;
    }

    public boolean isPageFlag() {
        return pageFlag;
    }

    @Override
    public String toString() {
        return pageNum + " " + memPageNum + " " + pageFlag + "\n";
    }
}
