# Write your MySQL query statement below
SELECT DISTINCT A.author_id AS id
FROM Views AS A
INNER JOIN Views AS B ON A.author_id = B.author_id AND A.article_id = B.article_id
WHERE A.author_id = A.viewer_id
ORDER BY id;
