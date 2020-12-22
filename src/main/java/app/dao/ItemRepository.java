package app.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app.model.Item;

@Repository
@Transactional
@Scope("singleton")
public interface ItemRepository extends JpaRepository<Item,Long> {

}
