//package com.example.t2009m1relationship.search;
//
//import com.example.t2009m1relationship.entity.Order;
//import org.springframework.data.jpa.domain.Specification;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Predicate;
//import javax.persistence.criteria.Root;
//
//public class OrderSpecification implements Specification<Order> {
//    private SearchCriteria searchCriteria;
//
//    @Override
//    public Predicate toPredicate(Root<Order> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//        if (searchCriteria.getOperation().equalsIgnoreCase(">=")){
//            return criteriaBuilder.greaterThanOrEqualTo(root.<String>get(searchCriteria.getKey()),String.valueOf(searchCriteria.getValue()));
//        }else if(searchCriteria.getOperation().equalsIgnoreCase("<=")){
//            return criteriaBuilder.lessThanOrEqualTo(root.<String>get(searchCriteria.getKey()), String.valueOf(searchCriteria.getValue()));
//        }else if(searchCriteria.getOperation().equalsIgnoreCase(">")){
//            return criteriaBuilder.greaterThan(root.<String>get(searchCriteria.getKey()), String.valueOf(searchCriteria.getValue()));
//        }else if(searchCriteria.getOperation().equalsIgnoreCase("<")) {
//            return criteriaBuilder.lessThan(root.<String>get(searchCriteria.getKey()), String.valueOf(searchCriteria.getValue()));
//        }else if (searchCriteria.getOperation().equalsIgnoreCase(":")) {
//                if (root.get(searchCriteria.getKey()).getJavaType() == String.class) {
//                    return CriteriaBuilder.like(
//                            root.<String>get(searchCriteria.getKey()), "%" + searchCriteria.getValue() + "%");
//                } else {
//                    return CriteriaBuilder.equal(root.get(searchCriteria.getKey()), searchCriteria.getValue());
//                }
//            }
//            return null;
//        }
//}
