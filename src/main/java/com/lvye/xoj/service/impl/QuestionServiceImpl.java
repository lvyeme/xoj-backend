package com.lvye.xoj.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lvye.xoj.model.entity.Question;
import com.lvye.xoj.service.QuestionService;
import com.lvye.xoj.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author 老子
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-03-12 07:37:31
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




