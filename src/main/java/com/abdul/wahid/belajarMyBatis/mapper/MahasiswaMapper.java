package com.abdul.wahid.belajarMyBatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.abdul.wahid.belajarMyBatis.domain.Mahasiswa;

public interface MahasiswaMapper {

	@Insert("insert into Mahasiswa(npm, nama, kelas, jenisKelamin) values(#{npm}, #{nama}, #{kelas}, #{jenisKelamin})")
	public void save(Mahasiswa mahasiswa);

	@Update("update Mahasiswa set nama = #{nama}, kelas = #{kelas}, jenisKelamin = #{jenisKelamin} where npm= #{npm}")
	public void update(Mahasiswa mahasiswa);

	@Delete("delete from Mahasiswa where npm = #{npm}")
	public void delete(String npm);

	@Select("select npm, nama, kelas, jenisKelamin from Mahasiswa where npm = #{npm}")
	public Mahasiswa getMahasiswa(String npm);

	@Select("select * from Mahasiswa")
	@Results({ @Result(property = "npm", column = "npm"), @Result(property = "nama", column = "nama"),
			@Result(property = "kelas", column = "kelas"),
			@Result(property = "jenisKelamin", column = "jenisKelamin") })
	public List<Mahasiswa> getMahasiswas();
}
