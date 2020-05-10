
package BaiTap2;

import java.util.ArrayList;

public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHangHoa(HangHoa hh){
        dshh.add(hh);
    }
    
    public int tinhTien(){
        int T = 0;
        for (int i = 0;i<dshh.size();i++){
            T = T + dshh.get(i).getGia();
        }
        return T;
           
    }
    public double soTienKhachTra(){
        return hinhThucTT.thanhToan(tinhTien());
    }
    public void hienThi(){
        for(int i = 0; i<dshh.size();i++){
            dshh.get(i).hienThi();
        }
    }

    public ArrayList<HangHoa> getDshh() {
        return dshh;
    }

    public void setDshh(ArrayList<HangHoa> dshh) {
        this.dshh = dshh;
    }

}
