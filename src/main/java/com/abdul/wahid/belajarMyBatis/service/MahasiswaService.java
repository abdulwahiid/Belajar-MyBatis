package com.abdul.wahid.belajarMyBatis.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.abdul.wahid.belajarMyBatis.domain.Mahasiswa;
import com.abdul.wahid.belajarMyBatis.mapper.MahasiswaMapper;
import com.abdul.wahid.belajarMyBatis.util.MyBatisUtil;

public class MahasiswaService {

	public void save(Mahasiswa mahasiswa) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();

		try {
			MahasiswaMapper mahasiswaMapper = session.getMapper(MahasiswaMapper.class);
			mahasiswaMapper.save(mahasiswa);
			session.commit();
		} catch (Exception exception) {
			session.rollback();
		} finally {
			session.close();
		}

	}

	public void update(Mahasiswa mahasiswa) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();

		try {
			MahasiswaMapper mahasiswaMapper = session.getMapper(MahasiswaMapper.class);
			mahasiswaMapper.update(mahasiswa);
			session.commit();
		} catch (Exception exception) {
			session.rollback();
		} finally {
			session.close();
		}

	}

	public void delete(String npm) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();

		try {
			MahasiswaMapper mahasiswaMapper = session.getMapper(MahasiswaMapper.class);
			mahasiswaMapper.delete(npm);
			session.commit();
		} catch (Exception exception) {
			session.rollback();
		} finally {
			session.close();
		}

	}

	public Mahasiswa getMahasiswa(String npm) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();

		try {
			MahasiswaMapper mahasiswaMapper = session.getMapper(MahasiswaMapper.class);
			return mahasiswaMapper.getMahasiswa(npm);
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

	public List<Mahasiswa> getMahasiswas() {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();

		try {
			MahasiswaMapper mahasiswaMapper = session.getMapper(MahasiswaMapper.class);
			return mahasiswaMapper.getMahasiswas();
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

}
