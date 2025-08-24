package tech.buildrun.springsecurity.controller;

import tech.buildrun.springsecurity.controller.dto.FeedItemDto;
import java.util.List;

public record FeedDto(List<FeedItemDto> feedItens, int page, int pageSize, int totalPages, Long totalElements) {
}
