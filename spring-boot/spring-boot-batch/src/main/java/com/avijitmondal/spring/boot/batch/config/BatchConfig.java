package com.avijitmondal.spring.boot.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.avijitmondal.spring.boot.batch.tasks.TaskOne;
import com.avijitmondal.spring.boot.batch.tasks.TaskTwo;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	@Autowired
	private JobBuilderFactory jobs;

	@Autowired
	private StepBuilderFactory steps;

	@Bean
	public Step stepOne() {
		return steps.get("second step").tasklet(new TaskOne()).build();
	}

	@Bean
	public Step stepTwo() {
		return steps.get("first step").tasklet(new TaskTwo()).build();
	}

	@Bean
	public Job testJob() {
		return jobs.get("Test JOB").incrementer(new RunIdIncrementer()).start(stepOne()).next(stepTwo()).build();
	}
}
