package com.sk.files;


public class FloatTotalShow {
    public static void main(String[] args) {

    }

    /**
     * 将double类型显示不全的全部显示
     *
     * @param dou
     * @return
     */
    public static String bigDoubleToString(double dou) {
        Double d = new Double(dou);
        // System.out.println("d:="+d);
        java.text.NumberFormat nf = java.text.NumberFormat.getInstance();
        nf.setGroupingUsed(false);
        //  System.out.println("d:="+nf.format(d));
        return nf.format(d);
    }

}
