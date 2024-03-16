package com.lvye.xoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lvye.xoj.model.dto.question.QuestionQueryRequest;
import com.lvye.xoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.lvye.xoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.lvye.xoj.model.entity.Question;
import com.lvye.xoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lvye.xoj.model.entity.User;
import com.lvye.xoj.model.vo.QuestionSubmitVO;
import com.lvye.xoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 老子
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-03-12 07:39:08
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
