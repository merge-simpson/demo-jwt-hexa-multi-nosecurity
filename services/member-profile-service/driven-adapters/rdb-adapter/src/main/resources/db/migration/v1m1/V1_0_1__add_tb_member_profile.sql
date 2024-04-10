CREATE TABLE IF NOT EXISTS member_profile (
    id                      UUID                            DEFAULT uuid_generate_v4(),
    account_id              UUID,
    username                VARCHAR(255),
    nickname                VARCHAR(255),
    gender                  CHAR(1),
    full_name               VARCHAR(255),
    email                   VARCHAR(255),

    status                  VARCHAR(255),
    created_at              TIMESTAMP                       DEFAULT now(),
    updated_at              TIMESTAMP,

    CONSTRAINT pk_member_profile PRIMARY KEY (id),
    CONSTRAINT uq_member_profile_account_id UNIQUE (account_id),
    CONSTRAINT uq_member_profile_username UNIQUE (username),
    CONSTRAINT uq_member_profile_nickname UNIQUE (nickname)
);

COMMENT ON COLUMN account.username  IS '계정(비정규화)';
COMMENT ON COLUMN account.account_id  IS 'account 테이블의 아이디';
COMMENT ON COLUMN account.nickname  IS '닉네임';
COMMENT ON COLUMN account.gender  IS '성별';
COMMENT ON COLUMN account.full_name  IS '본명';
COMMENT ON COLUMN account.email  IS '이메일. 모든 메일 호환 길이는 아니며(320), 효율을 위해 일반적인 권장 커버리지(254)만 채택함.';
COMMENT ON COLUMN account.status    IS '계정 상태(비정규화)';