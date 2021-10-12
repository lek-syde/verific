package com.nphcda.demo.Service;

import com.nphcda.demo.DTO.TrackedEntityInstance;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.Collections;
import java.util.List;

/**
 * @author Olalekan Folayan
 */
@Service
public class EntityService {


    public Page<TrackedEntityInstance> findPaginated(Pageable pageable, List<TrackedEntityInstance> trackedentities) {
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<TrackedEntityInstance> list;

        if (trackedentities.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, trackedentities.size());
            list = trackedentities.subList(startItem, toIndex);
        }

        Page<TrackedEntityInstance> bookPage
                = new PageImpl<TrackedEntityInstance>(list, PageRequest.of(currentPage, pageSize), trackedentities.size());

        return bookPage;
    }
}
