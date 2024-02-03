package prac.mybee.member;

import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper // for myBatis can read mapper
public interface MemberMapper {
    void save(Member member);
    Optional<Member> findById(Long id);
     List<Member> findAll(Searchform form);
    void updateMember(@Param("id") Long id, @Param("updateParam") Member updateParam);
    void addView(Long postId);
    void deleteMember(Long postId);
}