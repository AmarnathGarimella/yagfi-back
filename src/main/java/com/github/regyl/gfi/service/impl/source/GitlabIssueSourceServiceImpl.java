package com.github.regyl.gfi.service.impl.source;

import com.github.regyl.gfi.model.IssueTables;
import com.github.regyl.gfi.service.source.IssueSourceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GitlabIssueSourceServiceImpl implements IssueSourceService {

    @Override
    public void upload(IssueTables table) {

    }
}
