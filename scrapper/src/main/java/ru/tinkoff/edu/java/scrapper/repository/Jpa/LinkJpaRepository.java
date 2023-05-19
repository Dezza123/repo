package ru.tinkoff.edu.java.scrapper.repository.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.tinkoff.edu.java.scrapper.Model.Jpa.LinkJpa;
import ru.tinkoff.edu.java.scrapper.Model.Link;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface LinkJpaRepository extends JpaRepository<LinkJpa, Long> {

    @Query(value = "select * from link where link.url = :url", nativeQuery = true)
    LinkJpa findByUrl(String url);

    @Query(value = "select * from link where link.update < :timestamp", nativeQuery = true)
    List<LinkJpa> findOld(Timestamp timestamp);


    void update(LinkJpa link);
}
