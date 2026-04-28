CREATE OR REPLACE FUNCTION demo_students()
RETURNS TABLE(name VARCHAR, total INT)
AS $$
BEGIN
    RETURN QUERY
    SELECT * FROM (
        VALUES 
            ('Arun'::VARCHAR, 150),
            ('Kumar'::VARCHAR, 120),
            ('Ravi'::VARCHAR, 210)
    ) AS t(name, total);
END;
$$ LANGUAGE plpgsql;
SELECT * FROM demo_students();