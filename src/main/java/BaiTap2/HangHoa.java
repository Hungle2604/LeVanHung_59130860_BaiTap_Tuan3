
package BaiTap2;

public class HangHoa {
    
     String TenHH;
     int gia;
     String moTa;

    public HangHoa() {
    }

    public HangHoa(String TenHH, int gia, String moTa) {
        this.TenHH = TenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    public String getTenHH() {
        return TenHH;
    }

    public void setTenHH(String TenHH) {
        this.TenHH = TenHH;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }


    public void hienThi(){
        System.out.println("Tên hàng hóa : "+ TenHH);
        System.out.println("Gía hàng hóa : "+ gia);
        System.out.println("Mô tả hàng hóa : "+ moTa);
        
    }
     
    }

     

