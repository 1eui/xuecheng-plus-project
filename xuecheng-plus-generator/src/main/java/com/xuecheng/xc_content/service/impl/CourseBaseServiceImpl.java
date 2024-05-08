package com.xuecheng.xc_content.service.impl;

import com.xuecheng.xc_content.model.po.CourseBaseDTO;
import com.xuecheng.xc_content.mapper.CourseBaseMapper;
import com.xuecheng.xc_content.service.CourseBaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 课程基本信息 服务实现类
 * </p>
 *
 * @author itcast
 */
@Slf4j
@Service
public class CourseBaseServiceImpl extends ServiceImpl<CourseBaseMapper, CourseBaseDTO> implements CourseBaseService {

}
