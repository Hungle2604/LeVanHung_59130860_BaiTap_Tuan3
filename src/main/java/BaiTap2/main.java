
package BaiTap2;


public class main {

    public static void main(String[] args) {
        GioHang GH1 = new GioHang();
        GioHang GH2 = new GioHang();
        GH1.setHinhThucTT(new ThanhToanOnline());
        GH1.setHinhThucTT(new ThanhToanCOD());
        
        HangHoa HH1 = new HangHoa("Thịt Gà",100000,"Gà nhà");
        HangHoa HH2 = new HangHoa("Thịt Heo", 200000,"Heo nhà");
        HangHoa HH3 = new HangHoa("Bánh Bao", 300000,"Bánh Bao thơm ngon");
        HangHoa HH4 = new HangHoa("Kẹo Ngọt", 400000,"Kẹo ngon");
        
        GH1.themHangHoa(HH1);
        GH1.themHangHoa(HH2);
        GH1.themHangHoa(HH4);
        
        GH2.themHangHoa(HH3);
        GH2.themHangHoa(HH4);
        
        GH1.hienThi();
        System.out.println("Giõ hàng 1 : Tổng tiền hàng :   " + GH1.tinhTien());
        System.out.println("Giõ hàng 1 : Tiền Khách phải trả : "+ GH1.soTienKhachTra());
        
        GH2.hienThi();
        System.out.println("Giõ hàng 2 : Tổng tiền hàng :   " + GH2.tinhTien());
        System.out.println("Giõ hàng 2 : Tiền Khách phải trả : "+ GH2.soTienKhachTra());
    }
    
}
