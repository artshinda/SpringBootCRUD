package com.bcaf.ic.SpringBootCRUD.Util;

import com.bcaf.ic.SpringBootCRUD.Entity.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaDao extends JpaRepository<Mahasiswa,String> {
}
