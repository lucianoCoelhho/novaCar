package com.example.demo.Service;

public class PessoaGerenciamentoEmailService {


    /*
    *
    *
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EmailService emailService;

    public String solicitarCodigo(String email) {

        Pessoa pessoa = pessoaRepository.findByEmail(email);
        if(pessoa != null){
            pessoa.setCodigoRecuperacaoSenha(getCodigoRecuperacaoSenha(pessoa.getId()));
            pessoa.setDataEnvioCodigo(new Date());
            pessoaRepository.saveAndFlush(pessoa);
            emailService.enviarEmailTexto(pessoa.getEmail(), "codigo de recuperacao de senha ",
                "o seu codigo de recuperacao de senha e o seguinte: " + pessoa.getCodigoRecuperacaoSenha());

            return "codigo enviado!";
        }else{
            return "Nenhuma pessoa encontrada com o email fornecido";
        }

    }// ira salvar a pessoa




    /*
    * public Pessoa cadastrarPessoa(Pessoa pessoa) {
        if (pessoaRepository.findByEmail(pessoa.getEmail()).isPresent()) {
        throw new RuntimeException("E-mail já cadastrado.");
        }
        return pessoaRepository.save(pessoa);
        }
    *
    * */

}
