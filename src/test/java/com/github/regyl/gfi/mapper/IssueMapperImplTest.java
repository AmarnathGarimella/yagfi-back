package com.github.regyl.gfi.mapper;

import com.github.regyl.gfi.annotation.DefaultUnitTest;
import com.github.regyl.gfi.controller.dto.github.issue.GithubIssueDto;
import com.github.regyl.gfi.entity.IssueEntity;
import com.github.regyl.gfi.entity.RepositoryEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

@DefaultUnitTest
class IssueMapperImplTest {

    private IssueMapperImpl target;

    private final Supplier<OffsetDateTime> dateTimeSupplier = () -> OffsetDateTime.of(2026, 2, 6, 1, 20, 0, 0, ZoneOffset.UTC);

    @BeforeEach
    void setUp() {
        target = new IssueMapperImpl(dateTimeSupplier);
    }

    @Test
    void testLanguageDetection() {
        Map<String, RepositoryEntity> repos = new HashMap<>();
        GithubIssueDto dto = new GithubIssueDto();
        dto.setTitle("Some text");

        IssueEntity result = target.apply(repos, dto);

        Assertions.assertThat(result).isNotNull();
        Assertions.assertThat(result.getLanguage()).isEqualTo("ENGLISH");
    }
}
