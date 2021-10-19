/*
 * Created by Mingi Park on 2021/10/07
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Dev Backend Team <mingi@bigin.io>, 2021/10/07
 */

package com.batch.playground.springbatchplayground.part1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.stereotype.Component;

/**
 * create on 2021/10/07. create by IntelliJ IDEA.
 *
 * <p> 사용에 제한은 없으나 Spring Batch에서의 관리를 못받을수? 있다 </p>
 * <p> 권장 하지는 않음 </p>
 *
 * @author Mingi Park
 * @version 1.0
 * @see
 * @since 지원하는 자바버전 (ex : 5+ 5이상)
 */
@Component
@Slf4j
public class SimpleTasklet implements Tasklet {

  @Override
  public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext)
      throws Exception {
    log.info("this is first step tasklet!!");
    return RepeatStatus.FINISHED;
  }
}
