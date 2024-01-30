package com.lvye.xoj.model.dto.postfavour;

import com.lvye.xoj.model.dto.post.PostQueryRequest;
import com.lvye.xoj.common.PageRequest;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 帖子收藏查询请求
 *
 * @author <a href="https://github.com/lvyeme">Idol</a>
 * @from <a href="https://lvye.Idol">Idol</a>
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostFavourQueryRequest extends PageRequest implements Serializable {

    /**
     * 帖子查询请求
     */
    private PostQueryRequest postQueryRequest;

    /**
     * 用户 id
     */
    private Long userId;

    private static final long serialVersionUID = 1L;
}