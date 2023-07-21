package com.exam.exam4.repository;

import com.exam.exam4.entity.Child;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;


@Repository
@AllArgsConstructor
public class ChildRepository {
    private final JdbcTemplate template;


    public Child create(Child child) {
        String sql = "insert into child(name) values(?)";
        PreparedStatementCallback<? extends Object> callback = ps -> {

            ps.setString(1, child.getName());
            ps.execute();
            return ps;
        };
        template.execute(sql, callback);
        return child;
    }



    public void delete(Long id){
        String sql="delete from child where id=?";
        PreparedStatementCallback<? extends Object> callback=ps -> {
            ps.setLong(1, id);
            ps.execute();
            return ps;
        };
        template.execute(sql,callback);

    }
    public Child update(Long id,Child child){
        String sql ="update child set name=? where id=?";
        PreparedStatementCallback<? extends Object> callback=ps -> {
            ps.setString(1, child.getName());
            ps.setLong(2, id);
            ps.execute();
            return ps;
        };
        template.execute(sql,callback);
        return child;
    }



}



