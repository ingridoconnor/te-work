package com.techelevator.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.CatCard;
import com.techelevator.model.CatCardDAO;

@Component
public class JDBCCatCardDAO implements CatCardDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCCatCardDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<CatCard> list() {
		List<CatCard> card = new ArrayList<>();
		String sqlGetListOfCards = "SELECT * FROM catcards";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetListOfCards);
		while(results.next()) {
			CatCard cat = mapRowToCard(results);
			card.add(cat);
		}
		return card;
	}

	@Override
	public CatCard get(long id) {
		String sql = "SELECT * FROM catcards";
		jdbcTemplate.queryForObject(sql, Long.class, id);
		

		return id;
	}

	@Override
	public boolean update(long cardId, CatCard changedCard) {
		return false;
	}

	@Override
	public boolean delete(long id) {
		return false;
	}

	@Override
	public boolean save(CatCard card) {
		String sql = "INSERT INTO catcards (img_url, fact, caption) VALUES (?, ?, ?) RETURNING id";
		long id = jdbcTemplate.queryForObject(sql, Long.class, card.getImgUrl(), card.getCatFact(), card.getCaption());
		if(id > 0) {
			return true;
		}
		return false;
	}
	
	
	private boolean exists(long id) {
		String sql = "DELETE FROM catcards WHERE id = ?";
		id = jdbcTemplate.update(sql, id);
		if(id > 0) {
			return true;
		}
		return false;
	}
	
	private CatCard mapRowToCard(SqlRowSet rs) {
		CatCard cc = new CatCard();
		cc.setCatCardId(rs.getLong("id"));
		cc.setImgUrl("img_url");
		cc.setCaption("caption");
		cc.setCatFact("fact");
		return cc;
	}

}
