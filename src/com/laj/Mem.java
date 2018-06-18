package com.laj;

import java.util.ArrayList;
import java.util.Arrays;

public class Init {

    public static final int MEM_SIZE = 8;
    public static final int BLOCK_SIZE = 1;
    public static final int RES_SET_SIZE = 8;   //驻留集大小
    public static final int PRO_SUM_SIZE = 5;
    public static final boolean[] block = new boolean[MEM_SIZE];    //内存块标志数组
    //public static final int[][] segSum = new int[MEM_SIZE][2];    //总段数
    public static int processCount = 0; //当前进程数
    public static int pageTotal;    //总页数
    public static int count = 0;    //进程已占用的内存块数
    public static int inMemSeg = 0; //调入内存的段数
    public static int inMemPage = 0;    //调入内存的页数
    public static int segmentPNum = 0;  //每个段需要的内存
    public static int iMin, jMin, kMin, tMin;   //LRU
    public static boolean flag = true;
    public static int processNum = 0;   //每次进程进程申请的进程数量
    public static int[] resSet = new int[RES_SET_SIZE];

    public static void Create(){
        Process[] processes = new Process[5];
        SegmentTable[] segmentTables = new SegmentTable[10];
        PageTable[] pageTables = new PageTable[MEM_SIZE];
        Arrays.fill(block, false);  //初始化内存标志数组
        Arrays.fill(resSet, -1);    //初始化驻留集
        System.out.println("初始化结果如下：");
        CheckMem();
    }

    public static void CheckMem(){
        System.out.println("内存总量：" + MEM_SIZE + "\n已用空间：" + count + "\n剩余空间："
         + (MEM_SIZE - count) + "\n进程总数： " +  processCount);
        if(flag && count < MEM_SIZE){
            System.out.println("下面是可用的空闲块： ");
            for(int k = 0, i = 0; k < MEM_SIZE; k++){
                if(block[k] == false)
                    System.out.println(k + " " + (++i));
                if(i == 10){
                    System.out.println("");
                    i = 0;
                }
            }
            System.out.println("");
        }
        new ChoiceMenu();
    }

}
