package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class ListAnPham {
	private ArrayList<AnPham> anPhams;

	public ListAnPham(ArrayList<AnPham> anPhams) {
		this.anPhams = anPhams;
	}
	
	public double tongTien() {
		double res = 0;
		for (AnPham anPham : anPhams) {
			res += anPham.giaTien;
		}
		return res;
	}
	
	// tìm STK có số trang nhiều nhất
	// TODO: fix lại cho gọn đúng OOP
	public SachThamKhao findSTKSoChuongTrangNhieuNhat() {
		SachThamKhao res = null;
		if (anPhams.size() == 0) throw new NoSuchElementException("Empty");
		int max = Integer.MIN_VALUE;
		for (AnPham anPham : anPhams) {
			if (anPham.loaiAnPham().equals("STK")) {
				SachThamKhao stk = (SachThamKhao) anPham;
				int soTrang = stk.tongSoTrangCuaSach();
				if (soTrang > max) {
					max = soTrang;
					res = stk;
				}
			}
		}
		return res;
	}
	
	
	public TapChi tapChiCoTenChoTruoc(String name) {
		TapChi res = null;
		for (AnPham anPham : anPhams) {
			if (anPham.loaiAnPham().equals("TC")) {
				TapChi tc = (TapChi) anPham;
				if (tc.coCungTen(name)) {
					res = tc;
					break;
				}
			}
		}
		return res;
	}
	
	public List<TapChi> cacTapChiXuatBanVaoNam(int year) {
		List<TapChi> res = new ArrayList<>();
		for (AnPham anPham: anPhams) {
			if (anPham.loaiAnPham().equals("TC")) {
				TapChi tc = (TapChi) anPham;
				if (tc.coCungNam(year)) {
					res.add(tc);
				}
			}
		}
		return res;
	}
	
	public void sortTheoTieuDeVaGiamDanTheoNXB() {
		Collections.sort(anPhams, new SortByTieuDeVaGiamDanTheoNamXuatBan());
	}
	
	
	public Map<Integer, Integer> thongKeSoLuongTheoNXB() {
		Map<Integer, Integer> res = new HashMap<Integer, Integer>();
		
		for (AnPham anPham : anPhams) {
			int namXuatBan = anPham.namXuatBan.getYear();
			res.put(namXuatBan, res.getOrDefault(res, 0) + 1);
		}
		return res;
	}

	@Override
	public String toString() {
		return "ListAnPham [anPhams=" + anPhams + "]";
	}
	
	
	
	
	
	
	
}
