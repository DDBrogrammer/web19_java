package bai2;
import java.util.*;
public class LopHoc {
    private String ten_lop;

    public String getTen_lop() {
        return ten_lop;
    }

    public void setTen_lop(String ten_lop) {
        this.ten_lop = ten_lop;
    }

    public int getSo_luong_HS() {
        return so_luong_HS;
    }

    public void setSo_luong_HS(int so_luong_HS) {
        this.so_luong_HS = so_luong_HS;
    }

    private int so_luong_HS;


    private HocSinh[] cac_Hoc_Sinh;
    public HocSinh tim_kiem_HS(int ma_HS,HocSinh[] cac_Hoc_Sinh){
            for(HocSinh hs:cac_Hoc_Sinh){
                if( hs.getMa_HS()==ma_HS){
                    return hs;
                }
            }return null;

    }


    public LopHoc(String ten_lop, int so_luong_HS, HocSinh[] HS){
        this.ten_lop=ten_lop;
        this.so_luong_HS=so_luong_HS;
        this.cac_Hoc_Sinh =new HocSinh[so_luong_HS];
        this.cac_Hoc_Sinh =HS;

    }

    public static void main(String[] args) {
        int so_luong_HS=2;
        HocSinh HS_Nam=new HocSinh();
        HS_Nam.setTen("DO DAI");
        HS_Nam.setSo_dien_thoai("0961130568");
        HS_Nam.setDia_chi("HANOI ");
        HS_Nam.setMa_HS(666);

        HocSinh HS_nu= new HocSinh();
        HS_nu.setTen("AI");
        HS_nu.setSo_dien_thoai("12124325243");
        HS_nu.setDia_chi("VN");
        HS_nu.setMa_HS(777);

        HocSinh[] cac_Hoc_Sinh=new HocSinh[] {
            HS_Nam, HS_nu
        };

        System.out.println("nhap ma hoc sinh: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        LopHoc lophoc=new LopHoc("5c19",so_luong_HS,cac_Hoc_Sinh);
        HocSinh hs= lophoc.tim_kiem_HS(n,cac_Hoc_Sinh);
         if(hs==null){
             System.out.println("khong tim thay hoc sinh");

         }else{
             System.out.println("name"+hs.getTen());
             System.out.println("dia chi"+hs.getDia_chi());
             System.out.println("sdt "+hs.getSo_dien_thoai());

         }



    }



}
