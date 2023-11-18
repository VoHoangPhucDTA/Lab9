package Task2;

import java.util.Comparator;

public class SortByTieuDeVaGiamDanTheoNamXuatBan implements Comparator<AnPham>{

	@Override
	public int compare(AnPham o1, AnPham o2) {
		if (!o1.tieuDe.equals(o2.tieuDe))
			return o1.tieuDe.compareTo(o2.tieuDe);
		return o2.namXuatBan.getYear() - o1.namXuatBan.getYear();
	}

}
