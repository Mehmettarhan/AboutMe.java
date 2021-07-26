package day21_Loops;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class break_VS_EXIT {
    public static void main(String[] args) {

        for (int i = 0; i <=5 ; i++) {
            if (i==3){
                break; // exits the loop only
               // System.exit(0);
            }
            System.out.println("Cybertek School");

        }
        System.out.println("Batch_23");
    }
}
