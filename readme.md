# Annotations JPA

@Entity – especifica que a classe representa uma entidade no banco de dados. O estado da classe anotada com essa annotation é gerenciado pelo contexto de persistência subjacente.

@Basic – mapeia um tipo de atributo básico para uma coluna de uma tabela no banco de dados.

@Cacheable – especifica se uma entidade deve ser armazenada no cache de segundo nível.

@Table – especifica a tabela da entidade anotada.

@Column – especifica o mapeamento entre um atributo básico e a coluna da tabela de banco de dados.

@Id – especifica o identificador da entidade. Qualquer entidade precisa ter um atributo identificador, este que é usado ao carregar a entidade em um determinado contexto de persistência.

@GeneratedValue – especifica que o valor do identificador de entidade é gerado automaticamente utilizando a coluna de identidade, uma sequência de banco de dados ou um gerador de tabelas.

O Hibernate (uma implementação da JPA) suporta o mapeamento @GeneratedValue mesmo para os identificadores de UUID.

@Transient – especifica que um determinado atributo de entidade não deve ser persistido. Quase a mesma ideia da annotation do Spring Data.

@Lob – especifica que o atributo atualmente anotado representa um tipo de objeto grande.

@OneToOne – especifica um relacionamento de banco de dados um para um.

@ManyToOne – especifica um relacionamento de banco de dados muitos para um.

@OneToMany – especifica um relacionamento de banco de dados um para muitos.

@ManyToMany – especifica um relacionamento de banco de dados muitos para muitos.

@JoinColumn – especifica a coluna FOREIGN KEY utilizada ao ingressar em uma associação de entidades ou em uma coleção incorporável.

@JoinTable – especifica a tabela de links entre duas outras tabelas de banco de dados.

@MapsId – especifica que o identificador de identidade é mapeado pelo @ManyToOne atualmente anotado ou @OneToOne associado.

@ElementCollection – especifica uma coleção de tipos básicos ou incorporáveis.

@Embeddable – especifica tipos incorporáveis. Assim como os tipos básicos, os tipos incorporáveis não têm identidade, sendo gerenciados por sua entidade proprietária.

@Embedded – especifica que um determinado atributo de entidade representa um tipo incorporável.

@Enumerated – especifica que um atributo de entidade representa um tipo enumerado.

@JoinColumns – utilizada para agrupar várias anotações @JoinColumn que são utilizadas ao mapear a associação de entidades ou uma coleção incorporável utilizando um identificador composto.

@NamedQuery – especifica uma consulta JPQL que pode ser recuperada posteriormente por seu nome.

@OrderBy – especifica os atributos da entidade utilizados para classificação ao buscar a coleção atualmente anotada.

@PersistenceContext – especifica o EntityManager que precisa ser injetado como dependência.

@Temporal – especifica o tipo de tempo do atributo de entidade java.util.Date ou java.util.Calendar.

@Access – especifica o tipo de acesso da classe de entidade associada, superclasse associada ou atributo de classe e entidade incorporável.

@Inheritance – especifica a estratégia de herança de uma determinada hierarquia de classes de entidade.

@ForeignKey – especifica a chave estrangeira associada ao mapeamento @JoinColumn.

@Mapkey – especifica a chave de uma associação java.util.Map para o qual o tipo de chave é a chave primária ou atributo da entidade que representa o valor do mapa.

@NamedQueries – utilizada para agrupar várias anotações @NamedQuery.

@PersistenceUnit – especifica o EntityManagerFactory que precisa ser injetado como dependência.

@PersistenceUnits – utilizada para agrupar várias anotações @PersistenceUnit.

@PostLoad – especifica um método de retorno de chamada que é acionado depois que uma entidade é carregada.

@PostPersist – especifica um método de retorno de chamada que é acionado após uma entidade ser persistida.

@PostRemove – especifica um método de retorno de chamada que é acionado após uma entidade ser removida.

@PostUpdate – especifica um método de retorno de chamada que é acionado após uma entidade ser atualizada.

@PrePersist – especifica um método de retorno de chamada que é acionado antes que uma entidade seja persistida.

@PreRemove –  especifica um método de retorno de chamada que é acionado antes que uma entidade seja removida.

@PreUpdate –  especifica um método de retorno de chamada que é acionado antes que uma entidade seja atualizada.