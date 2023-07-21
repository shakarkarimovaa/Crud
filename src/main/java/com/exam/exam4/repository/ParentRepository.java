package com.exam.exam4.repository;

import com.exam.exam4.entity.Child;
import com.exam.exam4.entity.Parent;

import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@Repository

public class ParentRepository {
    private final JdbcTemplate template;



    public ParentRepository(JdbcTemplate template) {
        this.template = template;
    }


    @PostMapping
    public Parent create(Parent parent){
        String sql="insert into parents(name) values(?)";
        PreparedStatementCallback<? extends Object> callback= ps -> {
            ps.setString(1, parent.getName());
            ps.execute();
            return ps;
        };
        template.execute(sql,callback);
        return parent;
    }

    public List<Parent> getAll(Parent parent) {
        String sql = "select * from ";
        return template.query(sql, (rs, rowNum) -> new Parent (
                rs.getInt(1),
                rs.getString(2),
                rs.getString(2),
                rs.getInt(2),
                rs.getString(2)));
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(int id){
        String sql="delete from parents where id=?";
        PreparedStatementCallback<? extends Object> callback=ps -> {
            ps.setLong(1, id);
            ps.execute();
            return ps;
        };
        template.execute(sql,callback);

    }
}
