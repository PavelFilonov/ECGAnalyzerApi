package ru.vsu.csf.ecganalyzerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vsu.csf.ecganalyzerapi.entity.File;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
