
package BaiTap1;

public class main {

    public static void main(String[] args) {
        context ctx = new context();
        
        ctx.setTinhToan(new Cong());
        System.out.println("Kết quả phép tính 75 + 12 = " + ctx.tinh(75,12));
    
        ctx.setTinhToan(new Tru());
        System.out.println("Kết quả phép tính 54 - 78 = " + ctx.tinh(54,78));
    }
    
}
