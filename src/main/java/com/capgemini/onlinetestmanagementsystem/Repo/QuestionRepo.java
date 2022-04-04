package com.capgemini.onlinetestmanagementsystem.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.onlinetestmanagementsystem.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer>
{

}
