package com.abdul.wahid.belajarMyBatis;

import java.util.List;
import com.abdul.wahid.belajarMyBatis.domain.JenisKelamin;
import com.abdul.wahid.belajarMyBatis.domain.Mahasiswa;
import com.abdul.wahid.belajarMyBatis.service.MahasiswaService;

public class App {

	public static void main(String[] arg) {

		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNpm("031");
		mahasiswa.setNama("Wahid Abdul");
		mahasiswa.setKelas("3ia16");
		mahasiswa.setJenisKelamin(JenisKelamin.PRIA);

		MahasiswaService mahasiswaService = new MahasiswaService();
		//mahasiswaService.save(mahasiswa);
		
		//mahasiswaService.update(mahasiswa);
		
		//mahasiswaService.delete("031");
		
		List<Mahasiswa> mahasiswas = mahasiswaService.getMahasiswas();
		
		for (Mahasiswa mhs: mahasiswas){
			System.out.println(mhs.getNpm());
			System.out.println(mhs.getNama());
			System.out.println(mhs.getKelas());
			System.out.println(mhs.getJenisKelamin());
			System.out.println("");
		}
	}
}
