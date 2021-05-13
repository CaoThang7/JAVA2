/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author MyPC
 */
public class PolyStudent {
    public enum Career{
        UDPM,TKTW,LTDD,TKDH
    }
    public String fullname;
    public Career career;
    public void print(){
        System.out.println(">Fullname: "+this.fullname);
        switch(this.career){
            case UDPM:
                System.out.println(">Career: Ứng dụng phần mềm");
                break;
            case TKTW:
                System.out.println(">Career: thiết kế trang web");break;
            case LTDD:
                System.out.println(">Career: Lập trình di động");break;
            case TKDH:
                System.out.println(">Career: Thiết kế đồ họa");break;
        }
    }
    public static void main(String[] args) {
        PolyStudent sv  = new PolyStudent();
        sv.fullname = "Nguyễn Văn Tèo";
        sv.career = Career.valueOf("UDPM");
        sv.print();
    }
}
