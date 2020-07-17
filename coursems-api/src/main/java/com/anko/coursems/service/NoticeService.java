package com.anko.coursems.service;

import com.anko.coursems.core.IService;
import com.anko.coursems.entity.Notice;

public interface NoticeService {

    /**
     * 添加班级通知
     */
    Notice addNotice(Notice notice);

    /**
     * 删除班级通知
     * @param id 通知Id
     */
    int deleteNotice(String id);
}